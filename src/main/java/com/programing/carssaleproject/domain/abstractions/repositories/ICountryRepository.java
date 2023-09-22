package com.programing.carssaleproject.domain.abstractions.repositories;

import com.programing.carssaleproject.domain.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
    public Country findCountryByName(String name);
}
