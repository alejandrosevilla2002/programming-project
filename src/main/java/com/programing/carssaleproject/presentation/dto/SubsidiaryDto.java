package com.programing.carssaleproject.presentation.dto;

import com.programing.carssaleproject.domain.model.enums.CarStyle;

import java.util.List;

public class SubsidiaryDto {
    private Long id;
    private String name;
    private double taxRate;
    private List<CarStyle> carStyleList;
    private List<Long> carIds;
    private Long countryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<CarStyle> getCarStyleList() {
        return carStyleList;
    }

    public void setCarStyleList(List<CarStyle> carStyleList) {
        this.carStyleList = carStyleList;
    }

    public List<Long> getCarIds() {
        return carIds;
    }

    public void setCarIds(List<Long> carIds) {
        this.carIds = carIds;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }
}
