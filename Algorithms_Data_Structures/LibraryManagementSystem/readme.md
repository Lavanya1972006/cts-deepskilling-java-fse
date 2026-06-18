# Exercise 6: Library Management System

## 1. Understand Search Algorithms

### Linear Search

Linear Search checks each element one by one until the required book is found or the list ends.

### Binary Search

Binary Search repeatedly divides the sorted list into two halves to locate the required book. It works only on sorted data.

---

## 2. Setup

A Book class is created with the following attributes:

- bookId
- title
- author

---

## 3. Implementation

The following search algorithms are implemented:

- Linear Search to find a book by title.
- Binary Search to find a book by title (assuming the array is sorted by title).

---

## 4. Time Complexity Analysis

| Algorithm | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

---

## When to Use Each Algorithm

### Linear Search

- Small datasets
- Unsorted data
- Easy to implement

### Binary Search

- Large datasets
- Data is already sorted
- Faster searching than Linear Search

---

## Conclusion

Linear Search is suitable for small or unsorted datasets. Binary Search is much faster for large, sorted datasets because it reduces the search space by half in each step.