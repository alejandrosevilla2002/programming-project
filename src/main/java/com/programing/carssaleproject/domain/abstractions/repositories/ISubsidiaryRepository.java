package com.programing.carssaleproject.domain.abstractions.repositories;

import com.programing.carssaleproject.domain.model.Subsidiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubsidiaryRepository extends JpaRepository<Subsidiary, Long> {
}
