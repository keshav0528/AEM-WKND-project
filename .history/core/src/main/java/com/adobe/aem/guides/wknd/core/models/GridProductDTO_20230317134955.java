package com.adobe.aem.guides.wknd.core.models;

public class GridProductDTO {
    
    String id;
    String description;
    String price;
    String image;
    String title;
    String button;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setButton(String button) {
        this.button = button;
    }
    public String getButton() {
        return button;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getPrice() {
        return price;
    }

    public void set(String price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
