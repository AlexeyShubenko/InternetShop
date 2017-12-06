package com.shop.mvc.domain.technical;

public class Computer extends TechnicalProduct {

    private String videoCard;
    private Boolean backLighting;

    public Computer() {
    }

    public Computer(String producedBy, String title, Integer price, String description, String processor, Double screedSize, Integer ram, Integer hdd, String color, Double weight,
                    String operationSystem, String videoCard, Boolean backLighting) {
        super(producedBy, title, price, description, operationSystem, processor, screedSize, ram, hdd, color, weight);
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
