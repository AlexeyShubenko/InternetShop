package com.shop.mvc.domain.technical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "computer")
public class Computer extends TechnicalProduct {

    @Column
    private String videoCard;
    @Column
    private Boolean backLighting;

    public Computer() {
    }

    public Computer(String producedBy, String title, Integer price, String description,
                    String operationSystem, String processor, Double screedSize, Integer ram,
                    Integer hdd, String color, Double weight, Integer battery,
                    String videoCard, Boolean backLighting) {
        super(producedBy, title, price, description, operationSystem, processor, screedSize, ram, hdd, color, weight, battery);
        this.videoCard = videoCard;
        this.backLighting = backLighting;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Boolean getBackLighting() {
        return backLighting;
    }

    public void setBackLighting(Boolean backLighting) {
        this.backLighting = backLighting;
    }
}
