# Exercise 2: E-commerce Platform Search Function

## 1. Understand Asymptotic Notation

### What is Big O Notation?

Big O notation is used to measure the performance of an algorithm. It helps us understand how the execution time increases when the input size increases.

### Best, Average and Worst Case

**Best Case**
- The product is found immediately.
- Linear Search: O(1)
- Binary Search: O(1)

**Average Case**
- The product is found after checking some elements.
- Linear Search: O(n)
- Binary Search: O(log n)

**Worst Case**
- The product is found at the end or not found.
- Linear Search: O(n)
- Binary Search: O(log n)

## 2. Setup

A Product class is created with the following attributes:
- productId
- productName
- category

## 3. Implementation

- Linear Search is implemented using an array of products.
- Binary Search is implemented using a sorted array of products.
- Both algorithms search products using productId.

## 4. Analysis

| Algorithm | Time Complexity |
|-----------|----------------|
| Linear Search | O(n) |
| Binary Search | O(log n) |

### Which Algorithm is More Suitable?

Binary Search is more suitable for an e-commerce platform because it is faster than Linear Search when the data is sorted. It performs well for large numbers of products.

### Conclusion

Linear Search is simple and easy to implement. Binary Search is more efficient and provides faster search results for large datasets.