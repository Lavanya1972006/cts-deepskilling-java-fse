package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilTest {

    NumberUtil numberUtil = new NumberUtil();

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "4, true",
            "6, true",
            "1, false",
            "3, false",
            "5, false"
    })
    void testIsEven(int input, boolean expected) {
        assertEquals(expected, numberUtil.isEven(input));
    }
}