package com.programing.carssaleproject.aplication.implementations;

import com.programing.carssaleproject.aplication.exceptions.SubsidiaryNotFoundException;
import com.programing.carssaleproject.domain.abstractions.dtos.CarCreationRequest;
import com.programing.carssaleproject.domain.abstractions.repositories.ICarRepository;
import com.programing.carssaleproject.domain.abstractions.repositories.ISubsidiaryRepository;
import com.programing.carssaleproject.domain.abstractions.services.ICarService;
import com.programing.carssaleproject.domain.model.Car;
import com.programing.carssaleproject.domain.model.Subsidiary;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICarService {
    @Autowired
    private ICarRepository carRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ISubsidiaryRepository subsidiaryRepository;


    @Override
    public Car createCar(CarCreationRequest carDTO) {
        Optional<Subsidiary> subsidiary = subsidiaryRepository.findById(carDTO.getSubsidiaryId());
        if (subsidiary.isPresent()) {
            carDTO.setSubsidiaryId(0L);
            var car = modelMapper.map(carDTO, Car.class);
            car.setSubsidiary(subsidiary.get());
            return carRepository.save(car);
        } else {
            throw new SubsidiaryNotFoundException("Subsidiary not found for ID: " + carDTO.getSubsidiaryId());
        }
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}
