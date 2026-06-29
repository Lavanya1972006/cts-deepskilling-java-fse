package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get countries containing the given text
    public List<Country> getCountriesContaining(String text) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(text);
    }

    // Get countries starting with the given alphabet
    public List<Country> getCountriesStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWithIgnoreCase(alphabet);
    }
}