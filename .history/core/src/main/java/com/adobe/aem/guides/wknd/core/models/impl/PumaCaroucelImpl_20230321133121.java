
package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.PumaCaroucel;


@Model(adaptables = {Resource.class},
         adapters = PumaCaroucel.class,
         resourceType = {PumaCaroucelImpl.RESOURCE_TYPE},
          defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class PumaCaroucelImpl  implements PumaCaroucel{
    protected static final String RESOURCE_TYPE = "wknd/compoents/puma_caroucel";

    @ValueMapValue
    String title;

    @ValueMapValue
    String text;

    @ValueMapValue
    String image;
    @ValueMapValue
    String title2;

    @ValueMapValue
    String text2;

    @ValueMapValue
    String image2;

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return title;
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
    public String getTitle2() {
        // TODO Auto-generated method stub
       return title
    }

    @Override
    public String getImage2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getImage2'");
    }

    @Override
    public String getText2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getText2'");
    }
    
}
