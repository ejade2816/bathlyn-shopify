package com.bathlyn.shopify.bindys;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@CsvRecord(separator = ",")
public class OutputRecordBindy {
    
    @DataField(pos = 1, columnName = "Handle")
    private String handle;

    @DataField(pos = 2, columnName = "Title")
    private String title;

    @DataField(pos = 3, columnName = "Body (HTML)")
    private String bodyHtml;

    @DataField(pos = 4, columnName = "Vendor")
    private String vendor;

    @DataField(pos = 5, columnName = "Standardized Product Type")
    private String standardizedProductType;

    @DataField(pos = 6, columnName = "Custom Product Type")
    private String customProductType;

    @DataField(pos = 7, columnName = "Tags")
    private String tags;

    @DataField(pos = 8, columnName = "Published")
    private String published;

    @DataField(pos = 9, columnName = "Option1 Name")
    private String option1Name;

    @DataField(pos = 10, columnName = "Option1 Value")
    private String option1Value;

    @DataField(pos = 11, columnName = "Option2 Name")
    private String option2Name;

    @DataField(pos = 12, columnName = "Option2 Value")
    private String option2Value;

    @DataField(pos = 13, columnName = "Option3 Name")
    private String option3Name;

    @DataField(pos = 14, columnName = "Option3 Value")
    private String option3Value;

    @DataField(pos = 15, columnName = "Variant SKU")
    private String variantSku;

    @DataField(pos = 16, columnName = "Variant Grams")
    private String variantGrams;

    @DataField(pos = 17, columnName = "Variant Inventory Tracker")
    private String variantInventoryTracker;

    @DataField(pos = 18, columnName = "Variant Inventory Qty")
    private String variantInventoryQty;

    @DataField(pos = 19, columnName = "Variant Inventory Policy")
    private String variantInventoryPolicy;

    @DataField(pos = 20, columnName = "Variant Fulfillment Service")
    private String variantFulfillmentService;

    @DataField(pos = 21, columnName = "Variant Price")
    private String variantPrice;

    @DataField(pos = 22, columnName = "Variant Compare At Price")
    private String variantCompareAtPrice;

    @DataField(pos = 23, columnName = "Variant Requires Shipping")
    private String variantRequiresShipping;

    @DataField(pos = 24, columnName = "Variant Taxable")
    private String variantTaxable;

    @DataField(pos = 25, columnName = "Variant Barcode")
    private String variantBarcode;

    @DataField(pos = 26, columnName = "Image Src")
    private String imageSrc;

    @DataField(pos = 27, columnName = "Image Position")
    private String imagePosition;

    @DataField(pos = 28, columnName = "Image Alt Text")
    private String imageAltText;

    @DataField(pos = 29, columnName = "Gift Card")
    private String giftCard;

    @DataField(pos = 30, columnName = "SEO Title")
    private String seoTitle;

    @DataField(pos = 31, columnName = "SEO TitlDescriptione")
    private String seoDescription;

    @DataField(pos = 32, columnName = "Google Shopping / Google Product Category")
    private String googleShoppingGoogleProductCategory;

    @DataField(pos = 33, columnName = "Google Shopping / Gender")
    private String googleShoppingGender;

    @DataField(pos = 34, columnName = "Google Shopping / Age Group")
    private String googleShoppingAgeGroup;

    @DataField(pos = 35, columnName = "Google Shopping / MPN")
    private String googleShoppingMPN;

    @DataField(pos = 36, columnName = "Google Shopping / AdWords Grouping")
    private String googleShoppingAdWordsGrouping;

    @DataField(pos = 37, columnName = "Google Shopping / AdWords Labels")
    private String googleShoppingAdWordsLabels;

    @DataField(pos = 38, columnName = "Google Shopping / Condition")
    private String googleShoppingCondition;

    @DataField(pos = 39, columnName = "Google Shopping / Custom Product")
    private String googleShoppingCustomProduct;

    @DataField(pos = 40, columnName = "Google Shopping / Custom Label 0")
    private String googleShoppingCustomLabel0;

    @DataField(pos = 41, columnName = "Google Shopping / Custom Label 1")
    private String googleShoppingCustomLabel1;

    @DataField(pos = 42, columnName = "Google Shopping / Custom Label 2")
    private String googleShoppingCustomLabel2;

    @DataField(pos = 43, columnName = "Google Shopping / Custom Label 3")
    private String googleShoppingCustomLabel3;

    @DataField(pos = 44, columnName = "Google Shopping / Custom Label 4")
    private String googleShoppingCustomLabel4;

    @DataField(pos = 45, columnName = "Variant Image")
    private String variantImage;

    @DataField(pos = 46, columnName = "Variant Weight Unit")
    private String variantWeightUnit;

    @DataField(pos = 47, columnName = "Variant Tax Code")
    private String variantTaxCode;

    @DataField(pos = 48, columnName = "Cost per item")
    private String costPerItem;

    @DataField(pos = 49, columnName = "Price / International")
    private String priceInternational;

    @DataField(pos = 50, columnName = "Compare At Price / International")
    private String atPriceInternational;
    
    @DataField(pos = 51, columnName = "Status")
    private String status;

}

// Handle,
// Title,
// Body (HTML),
// Vendor,
// Standardized Product Type,
// Custom Product Type,
// Tags,
// Published,
// Option1 Name,
// Option1 Value,
// Option2 Name,
// Option2 Value,
// Option3 Name,
// Option3 Value,
// Variant SKU,
// Variant Grams,
// Variant Inventory Tracker,
// Variant Inventory Qty,
// Variant Inventory Policy,
// Variant Fulfillment Service,
// Variant Price,
// Variant Compare At Price,
// Variant Requires Shipping,
// Variant Taxable,
// Variant Barcode,
// Image Src,
// Image Position,
// Image Alt Text,
// Gift Card,
// SEO Title,
// SEO Description,
// Google Shopping / Google Product Category,
// Google Shopping / Gender,
// Google Shopping / Age Group,
// Google Shopping / MPN,
// Google Shopping / AdWords Grouping,
// Google Shopping / AdWords Labels,
// Google Shopping / Condition,
// Google Shopping / Custom Product,
// Google Shopping / Custom Label 0,
// Google Shopping / Custom Label 1,
// Google Shopping / Custom Label 2,
// Google Shopping / Custom Label 3,
// Google Shopping / Custom Label 4,
// Variant Image,
// Variant Weight Unit,
// Variant Tax Code,
// Cost per item,
// Status