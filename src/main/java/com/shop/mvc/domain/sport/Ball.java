package com.shop.mvc.domain.sport;

public class Ball extends SportProduct {
//1

    private String material;

    public Ball(){}

    public Ball(String producedBy, String title, Integer price, String description,
                String type, Double weight,
                String material) {
        super(producedBy, title, price, description, type, weight);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
