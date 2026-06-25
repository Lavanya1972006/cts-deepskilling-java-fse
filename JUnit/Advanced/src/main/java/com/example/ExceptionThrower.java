package com.example;
/**
 * Exercise 4: Exception Testing
 *
 * This class contains a method that deliberately
 * throws an ArithmeticException for testing purposes.
 */
public class ExceptionThrower {

    public void throwException() {
        throw new ArithmeticException("Exception Thrown");
    }
}