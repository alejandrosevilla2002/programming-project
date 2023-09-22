package com.programing.carssaleproject.domain.abstractions.repositories;

import com.programing.carssaleproject.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car, Long> {
}
