package com.programing.carssaleproject.domain.abstractions.services;

import com.programing.carssaleproject.domain.abstractions.dtos.CarCreationRequest;
import com.programing.carssaleproject.domain.model.Car;

import java.util.List;

public interface ICarService {

    public Car createCar(CarCreationRequest carDTO);

    public List<Car> getAllCars();


}
