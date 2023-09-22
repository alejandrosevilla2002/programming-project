package com.programing.carssaleproject.aplication.implementations;

import com.programing.carssaleproject.domain.abstractions.dtos.SubsidiaryCreationRequest;
import com.programing.carssaleproject.domain.abstractions.repositories.ISubsidiaryRepository;
import com.programing.carssaleproject.domain.abstractions.services.ISubsidiaryService;
import com.programing.carssaleproject.domain.model.Subsidiary;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsidiaryService implements ISubsidiaryService {
    @Autowired
    private ISubsidiaryRepository subsidiaryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Subsidiary createSubsidiary(SubsidiaryCreationRequest subsidiaryDTO) {
        var subsidiary = modelMapper.map(subsidiaryDTO, Subsidiary.class);
        return subsidiaryRepository.save(subsidiary);
    }

    @Override
    public List<Subsidiary> getAllSubsidiaries() {
        return subsidiaryRepository.findAll();
    }
}
