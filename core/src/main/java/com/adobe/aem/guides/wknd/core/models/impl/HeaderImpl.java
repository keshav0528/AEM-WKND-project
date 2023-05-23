package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;

import com.adobe.aem.guides.wknd.core.models.Header;
import com.adobe.aem.guides.wknd.core.models.HeaderDTO;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Header.class }, resourceType = {
        HeaderImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class HeaderImpl extends CustomComponentImpl implements Header {

    protected static final String RESOURCE_TYPE = "wknd/components/navbar";

    @SlingObject
    private Resource resource;

    @Self
    private SlingHttpServletRequest request;

    @ValueMapValue
    String logo;

    @ValueMapValue
    String homeLink;

    @ValueMapValue
    String weblink;

    @ValueMapValue
    String search;

    @ValueMapValue
    private List<HeaderDTO> category;

    @PostConstruct
    public void init() {
        category = new ArrayList<>();
        Resource res = resource.getChild("category");
        if (null != res && res.hasChildren()) {
            Iterator<Resource> cards = res.listChildren();
            while (cards.hasNext()) {
                Resource card = cards.next();
                HeaderDTO book = new HeaderDTO();
                book.setText(card.getValueMap().get("text", String.class));
                book.setLink(card.getValueMap().get("link", String.class));
                category.add(book);
            }
        }
    }

    @Override
    public String getLogo(){
        return logo;
    }

    

    @Override
    public String getSearch(){
        return search;
    }

    @Override
    
    public String getHomeLink(){
        return homeLink;
    }
    
    @Override
    public String getWeblink(){
        return weblink;
    }

    @Override
    public List<HeaderDTO> getCategory() {
        category.get(category.size() - 1).setId("rightnav");
        return category;
    }


     // this method will return boolean for for setting component Name if data is empty
     @Override
     public boolean isEmpty() {
         return StringUtils.isBlank(logo) && StringUtils.isBlank(weblink) && StringUtils.isBlank(search);
     }
}
