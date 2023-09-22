package com.programing.carssaleproject.domain.abstractions.dtos;

public class CarCreationRequest {
    private String color;
    private double price;
    private String engineType;
    private String style;
    private Long subsidiaryId;

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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Long getSubsidiaryId() {
        return subsidiaryId;
    }

    public void setSubsidiaryId(Long subsidiaryId) {
        this.subsidiaryId = subsidiaryId;
    }
}
