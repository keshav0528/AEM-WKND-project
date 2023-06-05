package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import com.adobe.aem.guides.wknd.core.models.PumaCarousel;
import com.adobe.aem.guides.wknd.core.models.PumaCarouselCtaLinks;
import com.adobe.aem.guides.wknd.core.models.PumaCarouselDTO;
import com.adobe.aem.guides.wknd.core.models.PumaCarouselStatistics;
import com.adobe.cq.sightly.WCMUsePojo;

import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { PumaCarousel.class }, resourceType = {
                PumaCarouselImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PumaCarouselImpl extends WCMUsePojo implements PumaCarousel {

        protected static final String RESOURCE_TYPE = "wknd/components/carouseltask";

        @SlingObject
        private Resource resource;

        @Self
        private SlingHttpServletRequest request;

        @ChildResource
        List<PumaCarouselCtaLinks> ctalinks;

        @ChildResource
        List<PumaCarouselStatistics> statistics;

        @ValueMapValue
        private List<PumaCarouselDTO> slider;

        @Override
        public List<PumaCarouselDTO> getSlider() {
                // TODO Auto-generated method stub
                // product.get(product.size() - 1).setId("product");
                return slider;
        }

        @Override
        public boolean isEmpty() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        }

        @Override
        public List<PumaCarouselCtaLinks> getCtaLinks() {

                return ctalinks;
        }

        @Override
        public List<PumaCarouselStatistics> getStatistics() {
                // TODO Auto-generated method stub
                return statistics;
        }

        @PostConstruct
        public void init() {
                slider = new ArrayList<>();
                ctalinks = new ArrayList<>();
                statistics = new ArrayList<>();
                Resource res = resource.getChild("slider");
                Resource res1 = resource.getChild("ctalinks");
                Resource res2 = resource.getChild("statistics");
                if (null != res2 && res2.hasChildren()) {
                        Iterator<Resource> cards = res2.listChildren();
                        while (cards.hasNext()) {
                                Resource card = cards.next();
                                PumaCarouselStatistics details = new PumaCarouselStatistics();

                                details.setTitlestatistics(card.getValueMap().get("titlestatistics",
                                                String.class));
                                details.setIcon(card.getValueMap().get("icon", String.class));
                                details.setNumber(card.getValueMap().get("number", String.class));

                                statistics.add(details);
                        }
                }
                if (null != res1 && res1.hasChildren()) {
                        Iterator<Resource> cards = res1.listChildren();
                        while (cards.hasNext()) {
                                Resource card = cards.next();
                                PumaCarouselCtaLinks details = new PumaCarouselCtaLinks();

                                details.setTitlecta(card.getValueMap().get("titlecta", String.class));
                                details.setLinkcta(card.getValueMap().get("linkscta", String.class));
                                details.setTargetcta(card.getValueMap().get("targetcta", String.class));

                                ctalinks.add(details);
                        }
                }
                if (null != res && res.hasChildren()) {
                        Iterator<Resource> cards = res.listChildren();
                        while (cards.hasNext()) {
                                Resource card = cards.next();
                                PumaCarouselDTO details = new PumaCarouselDTO();

                                details.setTitle(card.getValueMap().get("title", String.class));
                                details.setDescription(card.getValueMap().get("description", String.class));
                                details.setImage(card.getValueMap().get("image", String.class));

                                slider.add(details);
                        }
                }
        }

        @Override
        public void activate() throws Exception {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'activate'");
        }

}
