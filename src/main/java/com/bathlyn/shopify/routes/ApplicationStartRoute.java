package com.bathlyn.shopify.routes;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

import org.apache.camel.builder.AggregationStrategies;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.springframework.stereotype.Component;

import com.bathlyn.shopify.bindys.InputRecordBindy;
import com.bathlyn.shopify.bindys.OutputRecordBindy;
import com.bathlyn.shopify.processors.VanityBuilderProcessor;

@Component
public class ApplicationStartRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        
        
        BindyCsvDataFormat inputRecordBindyFormat = new BindyCsvDataFormat(InputRecordBindy.class);
        BindyCsvDataFormat outputRecordBindyFormat = new BindyCsvDataFormat(OutputRecordBindy.class);
        
        from("timer://runOnce?repeatCount=1")
            .pollEnrich("file:///Users/jiaqi/PHD/bathlyn_shopify/coding/shopify/assets/input?fileName=product_list.csv&noop=true")
            .unmarshal(inputRecordBindyFormat)
            .split(body())
                .setHeader("sku", simple("${in.body.sku}", String.class))
                .setHeader("imageFolderPath", simple("/Users/jiaqi/PHD/bathlyn_shopify/coding/shopify/assets/product_imgs/${in.header.sku}", String.class))
                .process(new VanityBuilderProcessor())
                .marshal(outputRecordBindyFormat)
                .enrich("file:///Users/jiaqi/PHD/bathlyn_shopify/coding/shopify/assets/output?fileName=shopify_import.csv&fileExist=append", AggregationStrategies.useOriginal())
                .process(exchange -> {
                    String imageFolderPath = exchange.getIn().getHeader("imageFolderPath", String.class);
                    System.out.println(imageFolderPath);
                    File file = new File(imageFolderPath);
                    String[] filenames = file.list();
                    // Arrays.sort(filenames);
                    Collections.reverse(Arrays.asList(filenames));
                    exchange.getIn().setBody(filenames);
                })
                .split(body())
                .choice().when(body().isNotEqualTo(simple("0.jpg")))
                .choice().when(body().isNotEqualTo(simple(".DS_Store")))
                    .process(exchange -> {
                        String sku = exchange.getIn().getHeader("sku", String.class);
                        String imgFileName = exchange.getIn().getBody(String.class);
                        OutputRecordBindy output = new OutputRecordBindy();
                        output.setHandle(sku);
                        output.setImageSrc(imgFileName);
                        int imagePosition = exchange.getProperty("CamelSplitIndex", Integer.class);
                        output.setImagePosition(""+(imagePosition+1));
                        exchange.getIn().setBody(output);
                    })
                    .marshal(outputRecordBindyFormat)
                    .enrich("file:///Users/jiaqi/PHD/bathlyn_shopify/coding/shopify/assets/output?fileName=shopify_import.csv&fileExist=append", AggregationStrategies.useOriginal());

    }
}
