# Advanced JUnit Testing Exercises

## Overview

This project demonstrates advanced JUnit 5 testing concepts using Java and Maven.

## Exercises Implemented

### Exercise 1: Parameterized Tests

* Created `EvenChecker` class.
* Tested multiple input values using `@ParameterizedTest` and `@ValueSource`.

### Exercise 2: Test Suites and Categories

* Created `AllTests` suite class.
* Grouped multiple test classes using `@Suite` and `@SelectClasses`.

### Exercise 3: Test Execution Order

* Created `OrderedTests` class.
* Controlled test execution order using `@TestMethodOrder` and `@Order`.

### Exercise 4: Exception Testing

* Created `ExceptionThrower` class.
* Verified exceptions using `assertThrows()`.

### Exercise 5: Timeout and Performance Testing

* Created `PerformanceTester` class.
* Verified execution time using `assertTimeout()`.

## Technologies Used

* Java 11
* JUnit 5
* Maven
* IntelliJ IDEA

## Project Structure

src/main/java/com/example

* EvenChecker.java
* ExceptionThrower.java
* PerformanceTester.java

src/test/java/com/example

* SampleTest.java
* EvenCheckerTest.java
* AllTests.java
* OrderedTests.java
* ExceptionThrowerTest.java
* PerformanceTesterTest.java
