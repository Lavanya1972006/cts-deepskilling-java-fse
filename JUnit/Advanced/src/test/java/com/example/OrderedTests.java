package com.example;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
/**
 * Exercise 3: Test Execution Order
 *
 * This test class demonstrates how to control
 * the order in which test methods are executed.
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("Test 1 Executed");
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("Test 2 Executed");
    }

    @Test
    @Order(3)
    void testThird() {
        System.out.println("Test 3 Executed");
    }
}