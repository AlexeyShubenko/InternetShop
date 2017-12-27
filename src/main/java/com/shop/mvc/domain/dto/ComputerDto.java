package com.shop.mvc.domain.dto;

public class ComputerDto {

    private String producedBy;
    private String title;
    private Integer price;
    private String operationSystem;
    private String processor;
    private Double screedSize;
    private Integer ram;
    private Integer hdd;
    private String color;
    private Double weight;
    private Integer battery;
    private String description;
    private String videoCard;
    private Boolean backLighting;

    public ComputerDto() {
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

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Double getScreedSize() {
        return screedSize;
    }

    public void setScreedSize(Double screedSize) {
        this.screedSize = screedSize;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
