package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

    private static final Logger logger =
            LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {

        logger.info("Application started");

        logger.debug("Debugging application flow");

        logger.warn("This is a warning message");

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Exception occurred: {}", e.toString());
        }

        logger.info("Application finished");
    }
}