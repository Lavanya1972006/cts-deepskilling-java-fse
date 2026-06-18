# Exercise 4: Employee Management System

## 1. Understand Array Representation

An array stores elements in contiguous memory locations. Each element can be accessed using its index, making retrieval efficient.

### Advantages of Arrays

- Fast access using index
- Easy to traverse
- Memory efficient
- Simple to implement

---

## 2. Setup

An Employee class is created with the following attributes:

- employeeId
- name
- position
- salary

Employee records are stored in an array.

---

## 3. Implementation

The following operations are implemented:

- Add Employee
- Search Employee
- Traverse Employees
- Delete Employee

---

## 4. Time Complexity Analysis

| Operation | Time Complexity |
|-----------|-----------------|
| Add | O(1) |
| Search | O(n) |
| Traverse | O(n) |
| Delete | O(n) |

---

## Limitations of Arrays

- Fixed size
- Insertion and deletion require shifting elements
- Memory cannot grow dynamically
- Inefficient for frequent updates

---

## When to Use Arrays

Arrays are suitable when:

- The number of elements is fixed.
- Fast index-based access is required.
- Data is mostly read rather than frequently inserted or deleted.

---

## Conclusion

This project demonstrates how arrays can be used to manage employee records by implementing add, search, traverse, and delete operations. Arrays are simple and efficient for fixed-size collections but have limitations when frequent modifications are required.