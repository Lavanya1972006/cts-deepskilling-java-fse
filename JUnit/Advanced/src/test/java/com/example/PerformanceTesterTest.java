package com.example;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;
import java.time.Duration;
/**
 * Exercise 5: Timeout and Performance Testing
 *
 * This test verifies that the method completes
 * within the specified time limit.
 */
public class PerformanceTesterTest {

    @Test
    void testPerformance() {
        PerformanceTester tester = new PerformanceTester();

        assertTimeout(Duration.ofSeconds(2), () -> {
            tester.performTask();
        });
    }
}