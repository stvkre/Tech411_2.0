package com.stvkre.tech411;

/**
 * Created by stephen on 8/25/17.
 */

public class blog {

    private String title, urlToImage, description, url;

    public blog() {

    }

    public blog(String title, String urlToImage, String description, String url) {
        this.title = title;
        this.urlToImage = urlToImage;
        this.description = description;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
