package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.adobe.aem.guides.wknd.core.models.GridProductCard;

@Model(adaptables = {Resource.class},
         adapters = GridProductCard.class,
         resourceType = {GridProductCardImpl.RESOURCE_TYPE},
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
    String text;


    @Override
    public String getTitle() {
       
        return title;
    }

    @Override
    public String getSubTitle() {
        // TODO Auto-generated method stub
        return subtitle;
    }

    @Override
    public String getImage() {
        // TODO Auto-generated method stub
        return image;
    }

    @Override
    public String getText() {
        // TODO Auto-generated method stub
        return text;
    }
    
}
