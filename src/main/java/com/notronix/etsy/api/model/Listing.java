package com.notronix.etsy.api.model;

import java.util.List;

public interface Listing
{
    Long getListingId();
    String getState();
    Long getUserId();
    Long getCategoryId();
    String getTitle();
    String getDescription();
    Float getCreationTsz();
    Float getEndingTsz();
    Float getOriginalCreationTsz();
    Float getLastModifiedTsz();
    Float getPrice();
    String getCurrencyCode();
    Integer getQuantity();
    List<String> getSku();
    List<String> getTags();
    List<String> getCategoryPaths();
    List<Long> getCategoryPathIds();
    Long getTaxonomyId();
    Long getSuggestedTaxonomyId();
    List<String> getTaxonomyPaths();
    List<String> getMaterials();
    Long getShopSectionId();
    Object getFeaturedRank();
    Float getStateTsz();
    String getUrl();
    Long getViews();
    Long getNumFavorers();
    Long getShippingTemplateId();
    Long getShippingProfileId();
    Long getProcessingMin();
    Long getProcessingMax();
    String getWhoMade();
    Boolean getIsSupply();
    String getWhenMade();
    Double getItemWeight();
    WeightUnit getItemWeightUnit();
    Double getItemLength();
    Double getItemWidth();
    Double getItemHeight();
    DimensionUnit getItemDimensionsUnit();
    Boolean getIsPrivate();
    String getRecipient();
    String getOccasion();
    List<String> getStyle();
    Boolean getNonTaxable();
    Boolean getIsCustomizable();
    Boolean getIsDigital();
    String getFileData();
    Boolean getCanWriteInventory();
    Boolean getHasVariations();
    Boolean getShouldAutoRenew();
    String getLanguage();

    User getUser();
    Shop getShop();
    ShopSection getSection();
    List<? extends ListingImage> getImages();
    ListingImage getMainImage();
    List<? extends ShippingInfo> getShippingInfo();
    ShippingTemplate getShippingTemplate();
    List<? extends ShippingUpgrade> getShippingUpgrades();
    List<? extends PaymentTemplate> getPaymentInfo();
    List<? extends ListingTranslation> getTranslations();
    List<? extends PropertyValue> getAttributes();
    List<? extends ListingInventory> getInventory();
}