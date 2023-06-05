package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

public class PumaCarouselCtaLinks {
        // String ctalinks;

        @ValueMapValue
        String titlecta;
        @ValueMapValue
        String linkcta;
        @ValueMapValue
        String targetcta;
        public void setTitlecta(String titlecta) {
                this.titlecta = titlecta;
            }
            public String getTitlecta() {
                return titlecta;
            }
            
     
            public String getLinkcta() {
                return linkcta;
            }
        
            public void setLinkcta(String linkcta) {
                this.linkcta = linkcta;
            }
            public String getTargetcta() {
                return targetcta;
            }
        
            public void setTargetcta(String targetcta) {
                this.targetcta = targetcta;
            }
}
