package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    public List<Country> getAllCountries() {

        return countryRepository.findAll();
    }


    public Country findCountryByCode(String code) {

        return countryRepository.findById(code).get();
    }


    // Hands-on 7
    @Transactional
    public void addCountry(Country country) {

        countryRepository.save(country);
    }


    // Hands-on 8
    @Transactional
    public void updateCountry(String code, String name) {

        Country country = countryRepository.findById(code).get();

        country.setName(name);

        countryRepository.save(country);
    }
}