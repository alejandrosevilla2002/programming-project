package com.programing.carssaleproject.presentation.controllers;

import com.programing.carssaleproject.domain.abstractions.dtos.SubsidiaryCreationRequest;
import com.programing.carssaleproject.domain.abstractions.services.ISubsidiaryService;
import com.programing.carssaleproject.domain.model.Subsidiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subsidiaries")
public class SubsidiaryController {

    @Autowired
    private ISubsidiaryService subsidiaryService;

    @PostMapping
    public ResponseEntity<Subsidiary> createSubsidiary(@RequestBody SubsidiaryCreationRequest subRequest) {
        var subsidiary = subsidiaryService.createSubsidiary(subRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(subsidiary);
    }

    @GetMapping
    public ResponseEntity<List<Subsidiary>> getAllSubsidiaries() {
        return ResponseEntity.ok(subsidiaryService.getAllSubsidiaries());
    }
}
