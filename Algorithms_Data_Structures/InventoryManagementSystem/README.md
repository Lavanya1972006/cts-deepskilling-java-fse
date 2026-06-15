# Exercise 1: Inventory Management System

## 1. Understand the Problem

**Why are Data Structures and Algorithms essential in handling large inventories?**

Data Structures and Algorithms help to store and manage a large number of products efficiently. They make operations like adding, updating, searching, and deleting products easier and faster.

**Types of Data Structures suitable for this problem**

- ArrayList
- HashMap
- TreeMap

**Chosen Data Structure:** HashMap

**Reason:** HashMap provides fast access to products using Product ID.

## 4. Analysis

| Operation | Time Complexity |
|-----------|----------------|
| Add Product | O(1) |
| Update Product | O(1) |
| Delete Product | O(1) |

**Optimization**

- Use HashMap for faster access.
- Use TreeMap for sorted data.
- Use database indexing for large inventories.