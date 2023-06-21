package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import com.adobe.aem.guides.wknd.core.models.CustomComponent;


public interface Profiletask  extends CustomComponent {

        List<ProfiletaskDTO> getProfiledetails();

        boolean isEmpty();

        
}
