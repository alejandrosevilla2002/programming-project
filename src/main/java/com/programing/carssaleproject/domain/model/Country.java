package com.programing.carssaleproject.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;
    private String localMoneyName;
    private double exchangeWithDollar;

    @OneToMany(mappedBy = "country")
    private List<Subsidiary> subsidiaries;

    public Country() {

    }

    public Country(String name, String region, String localMoneyName, double exchangeWithDollar, List<Subsidiary> subsidiaries) {
        this.name = name;
        this.region = region;
        this.localMoneyName = localMoneyName;
        this.exchangeWithDollar = exchangeWithDollar;
        this.subsidiaries = subsidiaries;
    }

    public void setExchangeWithDollar(double exchangeWithDollar) {
        this.exchangeWithDollar = exchangeWithDollar;
    }

    public List<Subsidiary> getSubsidiaries() {
        return subsidiaries;
    }

    public void setSubsidiaries(List<Subsidiary> subsidiaries) {
        this.subsidiaries = subsidiaries;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

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
