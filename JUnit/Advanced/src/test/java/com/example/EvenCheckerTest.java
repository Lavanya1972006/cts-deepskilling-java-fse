package com.example;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
/**
 * Exercise 1: Parameterized Tests
 *
 * This test class demonstrates parameterized testing using JUnit 5.
 * The same test method is executed multiple times with different
 * input values provided by @ValueSource.
 */
public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testEvenNumbers(int number) {
        assertTrue(checker.isEven(number));
    }
}