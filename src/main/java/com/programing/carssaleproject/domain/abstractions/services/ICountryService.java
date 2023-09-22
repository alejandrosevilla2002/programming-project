package com.programing.carssaleproject.domain.abstractions.services;

import com.programing.carssaleproject.domain.abstractions.dtos.CountryCreationRequest;
import com.programing.carssaleproject.domain.model.Country;

import java.util.List;

public interface ICountryService {
    public Country createCountry(CountryCreationRequest countryRequest);

    public List<Country> getAllCountries();
}
