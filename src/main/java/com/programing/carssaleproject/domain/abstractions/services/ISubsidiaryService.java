package com.programing.carssaleproject.domain.abstractions.services;

import com.programing.carssaleproject.domain.abstractions.dtos.CarCreationRequest;
import com.programing.carssaleproject.domain.abstractions.dtos.SubsidiaryCreationRequest;
import com.programing.carssaleproject.domain.model.Car;
import com.programing.carssaleproject.domain.model.Subsidiary;

import java.util.List;

public interface ISubsidiaryService {
    public Subsidiary createSubsidiary(SubsidiaryCreationRequest subsidiaryDTO);

    public List<Subsidiary> getAllSubsidiaries();
}
