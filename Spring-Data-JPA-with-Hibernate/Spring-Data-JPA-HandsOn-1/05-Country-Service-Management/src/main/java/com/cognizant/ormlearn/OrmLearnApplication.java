package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");

        testGetAllCountries();
        testGetCountry();
        testAddCountry();
        testUpdateCountry();
        testDeleteCountry();
        testSearchCountries();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start - Get All Countries");

        List<Country> countries = countryService.getAllCountries();

        countries.forEach(country -> LOGGER.debug("{}", country));

        LOGGER.info("End");
    }

    private static void testGetCountry() {
        LOGGER.info("Start - Get Country");

        Country country = countryService.getCountry("IN");

        LOGGER.debug("Country: {}", country);

        LOGGER.info("End");
    }

    private static void testAddCountry() {
        LOGGER.info("Start - Add Country");

        Country country = new Country("JP", "Japan");
        countryService.addCountry(country);

        LOGGER.info("Country Added Successfully");
    }

    private static void testUpdateCountry() {
        LOGGER.info("Start - Update Country");

        Country country = new Country("IN", "India Updated");
        countryService.updateCountry(country);

        LOGGER.info("Country Updated Successfully");
    }

    private static void testDeleteCountry() {
        LOGGER.info("Start - Delete Country");

        countryService.deleteCountry("JP");

        LOGGER.info("Country Deleted Successfully");
    }

    private static void testSearchCountries() {
        LOGGER.info("Start - Search Countries");

        List<Country> countries = countryService.searchCountries("in");

        countries.forEach(country -> LOGGER.debug("{}", country));

        LOGGER.info("End");
    }
}