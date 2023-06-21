package com.adobe.aem.guides.wknd.core.models.impl;


import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.Profiletask;
import com.adobe.aem.guides.wknd.core.models.ProfiletaskDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Profiletask.class }, resourceType = {
        ProfiletaskImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProfiletaskImpl extends CustomComponentImpl implements Profiletask{

        protected static final String RESOURCE_TYPE = "wknd/components/profiletaskchild";

        @SlingObject
        private Resource resource;
    
        @Self
        private SlingHttpServletRequest request;
      
        @ValueMapValue
        private List<ProfiletaskDTO> profiledetails;

        @PostConstruct
        public void init() {
                profiledetails = new ArrayList<>();
            Resource res = resource.getChild("profiledetails");
            if (null != res && res.hasChildren()) {
                Iterator<Resource> cards = res.listChildren();
                while (cards.hasNext()) {
                    Resource card = cards.next();
                    ProfiletaskDTO details = new ProfiletaskDTO();
                    details.setProfileimage(card.getValueMap().get("profileimage", String.class));
                    details.setName(card.getValueMap().get("name", String.class));
                    details.setSubtitle(card.getValueMap().get("subtitle", String.class));
                    details.setAbout(card.getValueMap().get("about", String.class));
                  
    
                    profiledetails.add(details);
                }
            }
        }

        @Override
        public List<ProfiletaskDTO> getProfiledetails() {
            // TODO Auto-generated method stub
            profiledetails.get(profiledetails.size() - 1).setId("profiledetails");
            return profiledetails;
        }

        @Override
        public boolean isEmpty() {
            // TODO Auto-generated method stub
            return  StringUtils.isBlank("Null");
        }
        
}
