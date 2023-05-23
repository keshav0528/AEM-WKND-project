package com.adobe.aem.guides.wknd.core.models;

import java.util.List;



public interface Header extends CustomComponent{
    String getLogo();

    String getWeblink();

    String getSearch();

    String getHomeLink();


    List<HeaderDTO> getCategory();
}