# Exercise 3: Sorting Customer Orders

## 1. Understand Sorting Algorithms

### Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. It is simple but not efficient for large datasets.

### Insertion Sort

Insertion Sort inserts each element into its correct position in the sorted part of the array. It works well for small or nearly sorted datasets.

### Quick Sort

Quick Sort selects a pivot element and partitions the array into smaller and larger elements. It is fast and efficient for large datasets.

### Merge Sort

Merge Sort divides the array into smaller parts, sorts them, and merges them back together. It provides consistent performance.

## 2. Setup

An `Order` class is created with the following attributes:

- orderId
- customerName
- totalPrice

User input is taken using the `Scanner` class to enter order details dynamically.

## 3. Implementation

- Accept order details from the user.
- Display the original list of orders.
- Implement Bubble Sort to sort orders based on `totalPrice`.
- Implement Quick Sort to sort the same orders.
- Display the sorted orders after each algorithm.

## 4. Analysis

| Algorithm | Time Complexity |
|-----------|----------------|
| Bubble Sort | O(n²) |
| Quick Sort (Average) | O(n log n) |
| Quick Sort (Worst) | O(n²) |

### Why is Quick Sort Preferred?

Quick Sort is generally preferred because it is significantly faster than Bubble Sort for large datasets. Its average time complexity of **O(n log n)** makes it suitable for sorting customer orders in e-commerce applications.


## Time Complexity Order (Ascending)

The time complexities are arranged from **smallest (fastest)** to **largest (slowest)**:

```text
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(n³) < O(2ⁿ) < O(n!)
```

**Note:** The leftmost complexity is the **smallest and most efficient**, while the rightmost complexity is the **largest and least efficient**.


## Summary

Bubble Sort is simple and easy to understand, whereas Quick Sort provides much better performance for larger datasets. This implementation accepts user input and demonstrates both sorting algorithms effectively.