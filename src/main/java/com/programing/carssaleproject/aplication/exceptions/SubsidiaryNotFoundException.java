package com.programing.carssaleproject.aplication.exceptions;

public class SubsidiaryNotFoundException extends RuntimeException {

    public SubsidiaryNotFoundException(String message) {
        super(message);
    }

    public SubsidiaryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}