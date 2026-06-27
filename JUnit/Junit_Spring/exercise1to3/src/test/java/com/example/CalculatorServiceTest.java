package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void testAdd() {
        CalculatorService calculatorService = new CalculatorService();

        int result = calculatorService.add(5, 3);

        assertEquals(8, result);
    }
}