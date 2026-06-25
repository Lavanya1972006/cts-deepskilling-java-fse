package com.example;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
/**
 * Exercise 2: Test Suites and Categories
 */
@Suite
@SelectClasses({
        EvenCheckerTest.class,
        SampleTest.class
})
public class AllTests {
}