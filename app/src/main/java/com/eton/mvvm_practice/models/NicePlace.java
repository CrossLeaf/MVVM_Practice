package com.eton.mvvm_practice.models;

public class NicePlace {
    private String title;
    private String imageUrl;

    public NicePlace(String imageUrl, String title) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
