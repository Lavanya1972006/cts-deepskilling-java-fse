package com.example;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
/**
 * Exercise 4: Exception Testing
 *
 * This test verifies that the expected exception
 * is thrown by the method.
 */
public class ExceptionThrowerTest {

    @Test
    void testException() {
        ExceptionThrower et = new ExceptionThrower();

        assertThrows(ArithmeticException.class, () -> {
            et.throwException();
        });
    }
}