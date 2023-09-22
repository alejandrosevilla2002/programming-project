package com.programing.carssaleproject.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.programing.carssaleproject.domain.model.enums.CarStyle;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "subsidiaries")
public class Subsidiary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double taxRate;
    private List<CarStyle> carStyleList;

    @OneToMany(mappedBy = "subsidiary")
    private List<Car> cars;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "country_id", insertable = false, updatable = false)
    private Long countryId;

    public Subsidiary(String name, double taxRate, List<CarStyle> carStyleList, List<Car> cars, Country country, Long countryId) {
        this.name = name;
        this.taxRate = taxRate;
        this.carStyleList = carStyleList;
        this.cars = cars;
        this.country = country;
        this.countryId = countryId;
    }

    public Subsidiary() {

    }

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }
}