package com.programing.carssaleproject.presentation.controllers;

import com.programing.carssaleproject.domain.abstractions.dtos.CarCreationRequest;
import com.programing.carssaleproject.domain.abstractions.services.ICarService;
import com.programing.carssaleproject.domain.model.Car;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    @Autowired
    private ICarService carService;

    @GetMapping
    @ApiOperation("Get All Cars")
    private ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.ok(carService.getAllCars());
    }

    @PostMapping
    @ApiOperation("Create new Car")
    public ResponseEntity<Car> createCar(@RequestBody CarCreationRequest carRequest) {
        var car = carService.createCar(carRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }
}
