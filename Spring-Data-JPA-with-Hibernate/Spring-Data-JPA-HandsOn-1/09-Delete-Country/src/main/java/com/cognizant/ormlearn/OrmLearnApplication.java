package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;


@SpringBootApplication
public class OrmLearnApplication {


    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);


    private static CountryService countryService;


    public static void main(String[] args)
            throws CountryNotFoundException {


        ApplicationContext context =
                SpringApplication.run(
                        OrmLearnApplication.class, args);


        countryService =
                context.getBean(CountryService.class);


        getAllCountriesTest();     // Hands-on 6

        testAddCountry();          // Hands-on 7

        testUpdateCountry();       // Hands-on 8

        testDeleteCountry();       // Hands-on 9
    }



    // Hands-on 6
    private static void getAllCountriesTest() {


        LOGGER.info("Start");


        List<Country> countries =
                countryService.getAllCountries();


        for(Country country : countries) {

            LOGGER.debug("Country: {}", country);
        }


        LOGGER.info("End");
    }




    // Hands-on 7
    private static void testAddCountry()
            throws CountryNotFoundException {


        LOGGER.info("Start");


        Country country =
                new Country("JP", "Japan");


        countryService.addCountry(country);


        Country addedCountry =
                countryService.findCountryByCode("JP");


        LOGGER.debug("Country Added: {}",
                addedCountry);


        LOGGER.info("End");
    }




    // Hands-on 8
    private static void testUpdateCountry()
            throws CountryNotFoundException {


        LOGGER.info("Start");


        countryService.updateCountry(
                "JP",
                "Japan Updated");


        Country updatedCountry =
                countryService.findCountryByCode("JP");


        LOGGER.debug("Country Updated: {}",
                updatedCountry);


        LOGGER.info("End");
    }




    // Hands-on 9
    private static void testDeleteCountry()
            throws CountryNotFoundException {


        LOGGER.info("Start");


        countryService.deleteCountry("JP");


        LOGGER.info("Country deleted successfully");


        LOGGER.info("End");
    }

}