package com.example;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Exercise 4: AAA Pattern, Setup and Teardown
 *
 * This exercise demonstrates Arrange–Act–Assert (AAA) pattern
 * and the use of @Before and @After methods for test setup and cleanup.
 */
public class AAAExampleTest {

    // Setup (runs before every test)
    @Before
    public void setUp() {
        System.out.println("Setup: Test starting...");
    }

    // Teardown (runs after every test)
    @After
    public void tearDown() {
        System.out.println("Teardown: Test finished...");
    }

    @Test
    public void testAddition() {

        // ARRANGE
        int a = 10;
        int b = 20;

        // ACT
        int result = a + b;

        // ASSERT
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication() {

        // ARRANGE
        int x = 5;
        int y = 4;

        // ACT
        int result = x * y;

        // ASSERT
        assertEquals(20, result);
    }
}