package com.shop.mvc.domain.sport;

import com.shop.mvc.domain.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

//@Entity
//@Table(name = "sport")
@MappedSuperclass
public class SportProduct extends Product {
//2
    @Column
    private String type;
    @Column
    private Double weight;

    public SportProduct() {
    }

    public SportProduct(String producedBy, String title, Integer price,
                        String description, String type, Double weight) {
        super(producedBy, title, price, description);
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
