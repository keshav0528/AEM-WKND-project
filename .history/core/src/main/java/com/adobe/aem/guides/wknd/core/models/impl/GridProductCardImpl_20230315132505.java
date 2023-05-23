package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.adobe.aem.guides.wknd.core.models.GridProductCard;

@Model(adaptables = {Resource.class},
         adapters = GridProductCard.class,
         resourceType = {ProductCardImpl.RESOURCE_TYPE},
          defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class GridProductCardImpl implements GridProductCard {

    protected static final String RESOURCE_TYPE = "wknd/compoents/productcard";

    @ValueMapValue
    String title;

    @ValueMapValue
    String subtitle;

    @ValueMapValue
    String image;

    @ValueMapValue
    String occupations;

    @ValueMapValue
    String text;


    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    @Override
    public String getSubTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSubTitle'");
    }

    @Override
    public String getImage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getImage'");
    }

    @Override
    public String getText() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getText'");
    }
    
}
