package com.adobe.aem.guides.wknd.core.models;

import java.util.List;



public interface GridProductCard  extends CustomComponent{
    // @Inject
	//   List<Product> getProducts();
    //   @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	//   interface Product {
	//     @Inject
	    String getText(); // corresponds name="./text"
        // String getTitle();
        // String getSubTitle();
        // String getImage();
        List<GridProductDTO> getProduct();
	  }
 
    

