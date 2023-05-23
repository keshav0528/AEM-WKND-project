package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.adobe.aem.guides.wknd.core.models.GridProductCard;
import com.adobe.aem.guides.wknd.core.models.GridProductDTO;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

@Model(adaptables = {Resource.class},
         adapters = GridProductCard.class,
         resourceType = {GridProductCardImpl.RESOURCE_TYPE},
          defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class GridProductCardImpl implements GridProductCard {

    protected static final String RESOURCE_TYPE = "wknd/compoents/gridproductcard";

    @SlingObject
    private Resource resource;

    @Self
    private SlingHttpServletRequest request;
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

    @PostConstruct
    public void init() {
        Product = new ArrayList<>();
        Resource res = resource.getChild("category");
        if (null != res && res.hasChildren()) {
            Iterator<Resource> cards = res.listChildren();
            while (cards.hasNext()) {
                Resource card = cards.next();
                GridProductDTO book = new GridProductDTO();
                book.setText(card.getValueMap().get("text", String.class));
                book.setLink(card.getValueMap().get("title", String.class));
                Product.add(book);
            }
        }
    }

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
