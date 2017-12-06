package com.shop.mvc.domain.technical;

import com.shop.mvc.domain.Product;

public class TechnicalProduct extends Product {

    private String operationSystem;
    private String processor;
    private Double screedSize;
    private Integer ram;
    private Integer hdd;
    private String color;
    private Double weight;

    public TechnicalProduct() {}

    public TechnicalProduct(String producedBy, String title, Integer price, String description,
                            String operationSystem, String processor, Double screedSize, Integer ram, Integer hdd, String color, Double weight) {
        super(producedBy, title, price, description);
        this.operationSystem = operationSystem;
        this.processor = processor;
        this.screedSize = screedSize;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
        this.weight = weight;
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
}
