package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.adobe.aem.guides.wknd.core.models.GridProductCard;
import com.adobe.aem.guides.wknd.core.models.GridProductDTO;

@Model(adaptables = {Resource.class},
         adapters = GridProductCard.class,
         resourceType = {GridProductCardImpl.RESOURCE_TYPE},
          defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class GridProductCardImpl implements GridProductCard {

    protected static final String RESOURCE_TYPE = "wknd/compoents/gridproductcard";

    @ValueMapValue
    String title;

    @ValueMapValue
    String subtitle;

    @ValueMapValue
    String image;

    @ValueMapValue
    String text;
    @ValueMapValue
    private List<GridProductDTO> Product;

    @Override
    public String getText() {
        // TODO Auto-generated method stub
       return text;
    }

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
    public List<GridProductDTO> getProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }


   



    
    
}
