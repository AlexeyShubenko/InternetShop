package com.shop.mvc.domain.sport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ball")
public class Ball extends SportProduct {
//1
    @Column
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
