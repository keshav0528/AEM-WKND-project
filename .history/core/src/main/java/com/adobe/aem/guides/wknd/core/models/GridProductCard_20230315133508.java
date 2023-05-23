package com.adobe.aem.guides.wknd.core.models;

import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
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
