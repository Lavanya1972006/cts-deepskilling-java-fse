package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String user = "Lavanya";
        int orderId = 1001;
        double amount = 750.50;

        // Parameterized logging examples
        logger.info("User {} placed an order with ID {}", user, orderId);

        logger.warn("Order {} is taking longer for user {}", orderId, user);

        logger.error("Payment failed for order {} with amount {}", orderId, amount);

        // Multiple values example
        int a = 10, b = 20;
        logger.debug("Values: a={}, b={}, sum={}", a, b, (a + b));
    }
}