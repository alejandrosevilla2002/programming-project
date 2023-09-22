package com.programing.carssaleproject.domain.abstractions.dtos;

public class CountryCreationRequest {
    private String name;
    private String region;
    private String localMoneyName;
    private double exchangeWithDollar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocalMoneyName() {
        return localMoneyName;
    }

    public void setLocalMoneyName(String localMoneyName) {
        this.localMoneyName = localMoneyName;
    }

    public double getExchangeWithDollar() {
        return exchangeWithDollar;
    }

    public void setExchangeWithDollar(int exchangeWithDollar) {
        this.exchangeWithDollar = exchangeWithDollar;
    }
}
