package com.programing.carssaleproject.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.programing.carssaleproject.domain.model.enums.CarStyle;
import com.programing.carssaleproject.domain.model.enums.Engine;
import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String color;
    private double price;
    private Engine engineType;
    private CarStyle style;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "subsidiary_id")
    private Subsidiary subsidiary;

    public Car(String color, double price, Engine engineType, CarStyle style, Subsidiary subsidiary) {
        this.color = color;
        this.price = price;
        this.engineType = engineType;
        this.style = style;
        this.subsidiary = subsidiary;
    }

    public Car() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Subsidiary getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(Subsidiary subsidiary) {
        this.subsidiary = subsidiary;
    }

    public CarStyle getStyle() {
        return style;
    }

    public void setStyle(CarStyle style) {
        this.style = style;
    }

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }
}