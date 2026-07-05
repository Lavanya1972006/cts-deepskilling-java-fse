package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country =
                (Country) context.getBean("country");

        LOGGER.info("END");

        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        LOGGER.info("END");

        return countryList;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                (List<Country>) context.getBean("countryList");

        Country result = null;

        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                result = country;
                break;
            }
        }

        if (result == null) {
            throw new CountryNotFoundException();
        }

        LOGGER.info("END");

        return result;
    }
}