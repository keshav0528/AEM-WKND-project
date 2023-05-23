package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.aem.guides.wknd.core.models.ProductCard;
@Model(adaptables = {Resource.class},
         adapters = ProductCard.class,
         resourceType = {ProductCardImpl.RESOURCE_TYPE},
          defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProductCardImpl implements ProductCard {
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

    //for second 

    @ValueMapValue
    String title2;

    @ValueMapValue
    String subtitle2;

    @ValueMapValue
    String image2;

    @ValueMapValue
    String occupations2;

    @ValueMapValue
    String text2;

    //for 3 container 

    @ValueMapValue
    String title3;

    @ValueMapValue
    String subtitle3;

    @ValueMapValue
    String image3;

    @ValueMapValue
    String occupations3;

    @ValueMapValue
    String text3;

    //for 4 container 

    @ValueMapValue
    String title4;

    @ValueMapValue
    String subtitle4;

    @ValueMapValue
    String image4;

    @ValueMapValue
    String occupations4;

    @ValueMapValue
    String text4;




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

    @Override
    public String getOccupation() {
        // TODO Auto-generated method stub
        return null;
    }

    public static String getResourceType() {
        return RESOURCE_TYPE;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getOccupations() {
        return occupations;
    }

    @Override
    public String getTitle2() {
        // TODO Auto-generated method stub
        return title2;
    }

    @Override
    public String getSubTitle2() {
        // TODO Auto-generated method stub
        return subtitle2;
    }

    @Override
    public String getImage2() {
        // TODO Auto-generated method stub
        return image2;
    }

    @Override
    public String getText2() {
        // TODO Auto-generated method stub
        return text2;
    }

    @Override
    public String getOccupation2() {
        // TODO Auto-generated method stub
        return occupations2;
    }

    @Override
    public String getTitle3() {
        // TODO Auto-generated method stub
        return title3;
    }

    @Override
    public String getSubTitle3() {
        // TODO Auto-generated method stub
        return subtitle3;
    }

    @Override
    public String getImage3() {
        // TODO Auto-generated method stub
        return image3;
    }

    @Override
    public String getText3() {
        // TODO Auto-generated method stub
        return text3;
    }

    @Override
    public String getOccupation3() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTitle4() {
        // TODO Auto-generated method stub
        return title4;
    }

    @Override
    public String getSubTitle4() {
        // TODO Auto-generated method stub
        return subtitle4;
    }

    @Override
    public String getImage4() {
        // TODO Auto-generated method stub
        return image4;
    }

    @Override
    public String getText4() {
        // TODO Auto-generated method stub
        return text4;
    }

    @Override
    public String getOccupation4() {
        // TODO Auto-generated method stub
        return null;
    }
    
     
}
