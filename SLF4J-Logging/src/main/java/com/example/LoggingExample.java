package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // ERROR level log
        logger.error("This is an error message");

        // WARN level log
        logger.warn("This is a warning message");

        // Additional examples (optional but useful)
        logger.info("This is an info message");

        logger.debug("This is a debug message");
    }
}