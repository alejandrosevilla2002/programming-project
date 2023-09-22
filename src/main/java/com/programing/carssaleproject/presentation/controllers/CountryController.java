package com.programing.carssaleproject.presentation.controllers;

import com.programing.carssaleproject.domain.abstractions.dtos.CountryCreationRequest;
import com.programing.carssaleproject.domain.abstractions.services.ICountryService;
import com.programing.carssaleproject.domain.model.Country;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {
    @Autowired
    private ICountryService countryService;

    @GetMapping
    @ApiOperation("Get All Countries")
    private ResponseEntity<List<Country>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAllCountries());
    }

    @PostMapping
    @ApiOperation("Create new Country")
    public ResponseEntity<Country> CreateCountry(@RequestBody CountryCreationRequest countryRequest) {
        var country = countryService.createCountry(countryRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(country);
    }
}
