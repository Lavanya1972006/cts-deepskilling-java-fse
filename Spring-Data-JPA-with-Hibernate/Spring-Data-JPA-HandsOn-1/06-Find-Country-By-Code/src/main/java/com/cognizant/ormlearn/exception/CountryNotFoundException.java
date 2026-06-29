package com.cognizant.ormlearn.exception;

public class CountryNotFoundException extends Exception {

    public CountryNotFoundException() {
        super();
    }

    public CountryNotFoundException(String message) {
        super(message);
    }
}