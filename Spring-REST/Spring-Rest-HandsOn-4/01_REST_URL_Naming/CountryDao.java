package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    private static List<Country> countryList;

    @PostConstruct
    public void init() {

        countryList = new ArrayList<>();

        countryList.add(new Country("IN", "India"));
        countryList.add(new Country("US", "United States"));
    }

    public Country getCountry(String code) {

        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}