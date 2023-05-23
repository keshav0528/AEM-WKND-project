package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import com.adobe.aem.guides.wknd.core.models.HeaderThought;

import org.apache.commons.lang3.StringUtils;
@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { HeaderThought.class }, resourceType = {
    HeaderThoughtImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderThoughtImpl extends CustomComponentImpl implements HeaderThought{

    protected static final String RESOURCE_TYPE = "wknd/components/headerthought";

    @ValueMapValue
    private String image;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String link;

    @ValueMapValue
    private String subheading;

    @ValueMapValue
    private String text;

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String getSubHeading() {
        return subheading;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override

    public boolean isEmpty() {

        return StringUtils.isBlank(image) && StringUtils.isBlank(title) && StringUtils.isBlank(heading)
                && StringUtils.isBlank(link) && StringUtils.isBlank(subheading) && StringUtils.isBlank(text);

    }

}