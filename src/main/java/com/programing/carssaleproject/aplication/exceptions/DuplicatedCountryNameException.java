package com.programing.carssaleproject.aplication.exceptions;

public class DuplicatedCountryNameException extends Exception {

    public DuplicatedCountryNameException(String message) {
        super(String.format("A template with name: %s already exists.", message));
    }
}