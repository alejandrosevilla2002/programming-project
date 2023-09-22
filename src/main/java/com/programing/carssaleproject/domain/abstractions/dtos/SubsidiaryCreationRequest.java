package com.programing.carssaleproject.domain.abstractions.dtos;

import java.util.List;

public class SubsidiaryCreationRequest {
    private String name;
    private double taxRate;

    private long countryId;
    private List<String> carStyleList;

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
