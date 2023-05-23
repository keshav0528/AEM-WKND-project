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

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { GridProductCard.class }, resourceType = {
    GridProductCardImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class GridProductCardImpl implements GridProductCard {

    protected static final String RESOURCE_TYPE = "wknd/compoents/gridproductcard";

    @SlingObject
    private Resource resource;

    @Self
    private SlingHttpServletRequest request;
    // @ValueMapValue
    // String title;

    // @ValueMapValue
    // String subtitle;

    // @ValueMapValue
    // String image;

    // @ValueMapValue
    // String text;
    @ValueMapValue
    private List<GridProductDTO> product;

    @PostConstruct
    public void init() {
        product = new ArrayList<>();
        Resource res = resource.getChild("product");
        if (null != res && res.hasChildren()) {
            Iterator<Resource> cards = res.listChildren();
            while (cards.hasNext()) {
                Resource card = cards.next();
                GridProductDTO details = new GridProductDTO();
                details.setText(card.getValueMap().get("text", String.class));
                details.setTitle(card.getValueMap().get("title", String.class));
                details.setSubtitle(card.getValueMap().get("subtitle", String.class));
                details.setImage(card.getValueMap().get("image", String.class));
              
                product.add(details);
            }
        }
    }

    // @Override
    // public String getText() {
    //     // TODO Auto-generated method stub
    //    return text;
    // }

    // @Override
    // public String getTitle() {
    //     // TODO Auto-generated method stub
    //     return title;
    // }

    // @Override
    // public String getSubTitle() {
    //     // TODO Auto-generated method stub
    //   return subtitle;
    // }

    // @Override
    // public String getImage() {
    //     // TODO Auto-generated method stub
    //    return image;
    // }

    @Override
    public List<GridProductDTO> getProduct() {
        // TODO Auto-generated method stub
        product.get(product.size() - 1).setId("rightnav");
        return product;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }


   

   


     // this method will return boolean for for setting component Name if data is empty
 

    
    
}
