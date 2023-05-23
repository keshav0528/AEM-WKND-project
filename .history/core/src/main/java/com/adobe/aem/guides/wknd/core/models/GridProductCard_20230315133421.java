package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import javax.inject.Inject;

public interface GridProductCard {
    @Inject
	  List<Product> getProducts();
    String getTitle();
    String getSubTitle();
    String getImage();
    String getText();
    
}
