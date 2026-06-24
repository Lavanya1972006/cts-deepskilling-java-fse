package com.example;
/**
 * Exercise 2: Writing Basic JUnit Tests
 *
 * This class contains a method to check whether a number
 * is Positive or Negative.
 *
 * If the number is greater than or equal to 0, it returns "Positive",
 * otherwise it returns "Negative".
 */
public class NumberUtil {

    public String checkNumber(int num) {
        if (num >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }
}