package com.adobe.aem.guides.wknd.core.models.impl;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.BreadcrumbNavbar;
import com.adobe.aem.guides.wknd.core.models.BreadcrumbNavbarDTO;
import com.day.cq.wcm.api.Page;




@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { BreadcrumbNavbar.class }, resourceType = {
        BreadcrumbNavbarImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BreadcrumbNavbarImpl extends CustomComponentImpl implements  BreadcrumbNavbar{


        protected static final String RESOURCE_TYPE = "wknd/components/breadcrumbnavbar";


       
    
        @SlingObject
        private Resource resource;

        @ScriptVariable
        private Page currentPage;
    
        @Self
        private SlingHttpServletRequest request;


        @ValueMapValue
        private ArrayList<BreadcrumbNavbarDTO> category;

        @PostConstruct
        public void init() {
            category = new ArrayList<>();
            BreadcrumbNavbarDTO PageDto = new BreadcrumbNavbarDTO();
                PageDto.setLink(currentPage.getPath());
                PageDto.setText(currentPage.getTitle());
                category.add(PageDto);
                while(currentPage != null && currentPage.getParent()!=null && !currentPage.getPath().equals("/content/wknd/us/puma/home")){
                        PageDto = new BreadcrumbNavbarDTO();
                        PageDto.setLink(currentPage.getParent().getPath());
                        PageDto.setText(currentPage.getParent().getTitle());
                        category.add(PageDto);
                        currentPage = currentPage.getParent();
                }
                Collections.reverse(category);
        }

        @Override
        public List<BreadcrumbNavbarDTO> getCategory() {
                category.get(category.size() - 1).setId("breadnavbar");
                return category;
        }

        @Override
        public boolean isEmpty() {
                return false;
        }

      
        
}
