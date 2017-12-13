package com.shop.mvc.domain.sport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "racket")
public class Racket extends SportProduct {
//3
    @Column
    private String playerClass;
    @Column
    private String gameStyle;
    @Column
    private Double thickness;

    public Racket(){
    }

    public Racket(String producedBy, String title, Integer price, String description,
                  String type, Double weight,
                  String playerClass, String gameStyle, Double thickness) {
        super(producedBy, title, price, description, type, weight);
        this.playerClass = playerClass;
        this.gameStyle = gameStyle;
        this.thickness = thickness;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getGameStyle() {
        return gameStyle;
    }

    public void setGameStyle(String gameStyle) {
        this.gameStyle = gameStyle;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }
}
