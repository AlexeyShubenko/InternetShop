package com.shop.mvc.domain.technical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mobilephone")
public class MobilePhone extends TechnicalProduct {

    @Column
    private Integer simCardAmount;
    @Column
    private Integer camera;

    public MobilePhone() {
    }

    public MobilePhone(String producedBy, String title, Integer price, String description,
                       String operationSystem, String processor, Double screedSize, Integer ram,
                       Integer hdd, String color, Double weight,
                       Integer battery, Integer simCardAmount, Integer camera) {
        super(producedBy, title, price, description, operationSystem, processor, screedSize, ram, hdd, color, weight, battery);
        this.simCardAmount = simCardAmount;
        this.camera = camera;
    }

    public Integer getSimCardAmount() {
        return simCardAmount;
    }

    public void setSimCardAmount(Integer simCardAmount) {
        this.simCardAmount = simCardAmount;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }
}
