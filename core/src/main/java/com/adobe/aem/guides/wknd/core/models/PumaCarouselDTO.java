package com.adobe.aem.guides.wknd.core.models;

import java.util.List;
import com.adobe.cq.sightly.WCMUsePojo;
import javax.inject.Inject;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

public class PumaCarouselDTO {
    String id;

    String title;

    String description;

    String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
