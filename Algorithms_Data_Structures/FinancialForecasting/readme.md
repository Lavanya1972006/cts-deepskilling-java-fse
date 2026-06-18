# Exercise 7: Financial Forecasting

## 1. Understand Recursive Algorithms

### What is Recursion?

Recursion is a programming technique in which a method calls itself until a base condition is reached. It simplifies problems that can be broken down into smaller, similar subproblems.

---

## 2. Setup

A recursive method named `futureValue()` is created to calculate the future value of an investment using:

- Current Value
- Growth Rate
- Number of Years

---

## 3. Implementation

The recursive method multiplies the current value by `(1 + growthRate)` each year until the number of years becomes zero.

Formula:

Future Value = Current Value × (1 + Growth Rate)^Years

---

## 4. Time Complexity Analysis

### Time Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

where **n** is the number of years.

---

## Optimization

The recursive solution creates one function call for every year, increasing memory usage.

To optimize:

- Use an iterative (loop-based) approach to reduce space complexity to **O(1)**.
- Use Dynamic Programming (Memoization) when recursive calculations involve repeated subproblems.

---

## Conclusion

Recursion provides a simple and elegant solution for financial forecasting. However, for large inputs, an iterative approach or memoization is preferred to improve efficiency and avoid excessive recursive calls.