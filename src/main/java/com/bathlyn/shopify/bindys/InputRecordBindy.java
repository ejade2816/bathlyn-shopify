package com.bathlyn.shopify.bindys;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@CsvRecord(separator = ",", skipFirstLine = true)
public class InputRecordBindy {
    
    @DataField(pos = 1, columnName = "SKU")
    private String sku;

    @DataField(pos = 2, columnName = "STYLE_COLLECTION")
    private String styleCollection;

    @DataField(pos = 3, columnName = "NAME")
    private String name;

    @DataField(pos = 4, columnName = "SIZE")
    private String size;

    @DataField(pos = 5, columnName = "COLOR")
    private String color;

    @DataField(pos = 6, columnName = "SIZE_COLLECTION")
    private String sizeCollection;

    @DataField(pos = 7, columnName = "PRODUCT_DIMENSION")
    private String productDimension;

    @DataField(pos = 8, columnName = "PRICE")
    private String price;

    @DataField(pos = 9, columnName = "TITLE")
    private String title;

    @DataField(pos = 10, columnName = "DESCRIPTION_1")
    private String description1;

    @DataField(pos = 11, columnName = "DESCRIPTION_2")
    private String description2;

    @DataField(pos = 12, columnName = "DESCRIPTION_3")
    private String description3;

    @DataField(pos = 13, columnName = "DESCRIPTION_4")
    private String description4;

    @DataField(pos = 14, columnName = "DESCRIPTION_5")
    private String description5;

}

// SKU,
// STYLE_COLLECTION,
// COLOR,
// SIZE_COLLECTION,
// PRODUCT_DIMENSION,
// PRICE,
// TITLE,
// DESCRIPTION_1,
// DESCRIPTION_2,
// DESCRIPTION_3,
// DESCRIPTION_4,
// DESCRIPTION_5