package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Exercise 2: JUnit Test for NumberUtil
 *
 * This test class verifies the checkNumber() method
 * for positive number condition.
 */
public class NumberUtilTest {

    @Test
    public void testPositive() {
        NumberUtil n = new NumberUtil();
        assertEquals("Positive", n.checkNumber(5));
    }
}