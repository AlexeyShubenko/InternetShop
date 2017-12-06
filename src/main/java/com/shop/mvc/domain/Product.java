package com.shop.mvc.domain;

//root class of all products
public class Product {
//4

    private String producedBy;
    private String title;
    private Integer price;
    private String description;
//    private Image image;

    public Product() {
    }

    public Product(String producedBy, String title, Integer price, String description) {
        this.producedBy = producedBy;
        this.title = title;
        this.price = price;
        this.description = description;
    }


    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
