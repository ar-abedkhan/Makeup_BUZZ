package com.abedkhan.makeup;

public class eyes {

    public String title,image,discription,shortdis;

    public eyes(String title, String image, String discription, String shortdis) {
        this.title = title;
        this.image = image;
        this.discription = discription;
        this.shortdis = shortdis;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShortdis() {
        return shortdis;
    }

    public void setShortdis(String shortdis) {
        this.shortdis = shortdis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
