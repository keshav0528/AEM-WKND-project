package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import javax.inject.Inject;
@Model(
	    adaptables = {Resource.class},
	    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public interface GridProductCard {
    @Inject
	  List<Product> getProducts();
    String getTitle();
    String getSubTitle();
    String getImage();
    String getText();
    
}
