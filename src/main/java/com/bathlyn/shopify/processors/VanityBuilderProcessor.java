package com.bathlyn.shopify.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.bathlyn.shopify.bindys.InputRecordBindy;
import com.bathlyn.shopify.bindys.OutputRecordBindy;

public class VanityBuilderProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        InputRecordBindy input = exchange.getIn().getBody(InputRecordBindy.class);
        OutputRecordBindy output = new OutputRecordBindy();
        output.setHandle(input.getSku());
        output.setTitle(input.getName());
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("\"");
        htmlBuilder.append(String.format("<p>%s</p>", input.getDescription1()));
        htmlBuilder.append(String.format("<p>%s</p>", input.getDescription2()));
        htmlBuilder.append(String.format("<p>%s</p>", input.getDescription3()));
        htmlBuilder.append(String.format("<p>%s</p>", input.getDescription4()));
        htmlBuilder.append(String.format("<p>%s</p>", input.getDescription5()));
        htmlBuilder.append("\"");
        output.setBodyHtml(htmlBuilder.toString());
        output.setVendor("");
        output.setStandardizedProductType("Furniture > Cabinets & Storage > Vanities > Bathroom Vanities");
        output.setTags("\""+input.getStyleCollection()+","+input.getSizeCollection()+"\"");
        output.setPublished("TRUE");
        output.setOption1Name("Title");
        output.setOption1Value("Default Title");
        output.setVariantSku(input.getSku());
        output.setVariantGrams("0");
        output.setVariantInventoryTracker("shopify");
        output.setVariantInventoryQty("10");
        output.setVariantInventoryPolicy("deny");
        output.setVariantFulfillmentService("manual");
        output.setVariantPrice(input.getPrice());
        output.setVariantRequiresShipping("TRUE");
        output.setVariantTaxable("TRUE");
        output.setImageSrc(String.format("/jiaqi/%s.jpg", input.getSku()));
        output.setImagePosition("1");
        output.setGiftCard("FALSE");
        output.setVariantWeightUnit("lb");
        output.setStatus("active");
        
        exchange.getIn().setBody(output);
    }
    
}
