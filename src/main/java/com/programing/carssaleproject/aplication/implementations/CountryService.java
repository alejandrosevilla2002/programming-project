package com.programing.carssaleproject.aplication.implementations;

import com.programing.carssaleproject.aplication.exceptions.DuplicatedCountryNameException;
import com.programing.carssaleproject.domain.abstractions.dtos.CountryCreationRequest;
import com.programing.carssaleproject.domain.abstractions.repositories.ICountryRepository;
import com.programing.carssaleproject.domain.abstractions.services.ICountryService;
import com.programing.carssaleproject.domain.model.Country;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private ICountryRepository countryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Country createCountry(CountryCreationRequest countryRequest) {
        try {
            verifyDuplicateCountryName(countryRequest.getName());
            var subsidiary = modelMapper.map(countryRequest, Country.class);
            return countryRepository.save(subsidiary);
        } catch (DuplicatedCountryNameException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    private void verifyDuplicateCountryName(String name) throws DuplicatedCountryNameException {
        var repeatedCountryName = countryRepository.findCountryByName(name);
        if (repeatedCountryName != null) {
            throw new DuplicatedCountryNameException(name);
        }
    }
}
