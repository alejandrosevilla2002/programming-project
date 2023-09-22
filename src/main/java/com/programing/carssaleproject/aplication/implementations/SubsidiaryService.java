package com.programing.carssaleproject.aplication.implementations;

import com.programing.carssaleproject.aplication.exceptions.EntityNotFoundException;
import com.programing.carssaleproject.domain.abstractions.dtos.SubsidiaryCreationRequest;
import com.programing.carssaleproject.domain.abstractions.repositories.ICountryRepository;
import com.programing.carssaleproject.domain.abstractions.repositories.ISubsidiaryRepository;
import com.programing.carssaleproject.domain.abstractions.services.ISubsidiaryService;
import com.programing.carssaleproject.domain.model.Country;
import com.programing.carssaleproject.domain.model.Subsidiary;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubsidiaryService implements ISubsidiaryService {
    @Autowired
    private ISubsidiaryRepository subsidiaryRepository;
    @Autowired
    private ICountryRepository countryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Subsidiary createSubsidiary(SubsidiaryCreationRequest subsidiaryDTO) {
        var subsidiary = modelMapper.map(subsidiaryDTO, Subsidiary.class);
        return subsidiaryRepository.save(subsidiary);
        /*Optional<Country> country = countryRepository.findById(subsidiaryDTO.getCountryId());
        if (country.isPresent()) {
            subsidiaryDTO.setCountryId(0L);
            var subsidiary = modelMapper.map(subsidiaryDTO, Subsidiary.class);
            subsidiary.setCountry(country.get());
            return subsidiaryRepository.save(subsidiary);
        } else {
            throw new EntityNotFoundException("Country not found for ID: " + subsidiaryDTO.getCountryId());
        }*/
    }

    @Override
    public List<Subsidiary> getAllSubsidiaries() {
        return subsidiaryRepository.findAll();
    }
}
