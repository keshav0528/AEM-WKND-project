package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

public interface PumaCarousel extends CustomComponent {


        List<PumaCarouselDTO> getSlider();

        List<PumaCarouselCtaLinks> getCtaLinks();
        List<PumaCarouselStatistics> getStatistics();
       
        
}
