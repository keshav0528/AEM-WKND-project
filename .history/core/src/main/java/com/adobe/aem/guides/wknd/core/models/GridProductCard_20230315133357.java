package com.adobe.aem.guides.wknd.core.models;

public interface GridProductCard {
    @Inject
	  List<Product> getProducts();
    String getTitle();
    String getSubTitle();
    String getImage();
    String getText();
    
}
