package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Exercise 1: Setting Up JUnit
 *
 * This test verifies that JUnit setup is working correctly.
 */
public class SampleTest {
    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;
        assertEquals(30, a + b);
    }
}
