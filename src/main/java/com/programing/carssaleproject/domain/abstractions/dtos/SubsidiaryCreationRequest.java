package com.programing.carssaleproject.domain.abstractions.dtos;

import java.util.List;

public class SubsidiaryCreationRequest {
    private String name;
    private String location;
    private String country;
    private double taxRate;
    private List<String> carStyleList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public List<String> getCarStyleList() {
        return carStyleList;
    }

    public void setCarStyleList(List<String> carStyleList) {
        this.carStyleList = carStyleList;
    }
}
