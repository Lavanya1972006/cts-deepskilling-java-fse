package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    // JPQL Query
    @Query("SELECT e FROM Employee e")
    List<Employee> getAllEmployees();


    // JPQL with condition
    @Query("SELECT e FROM Employee e WHERE e.salary > 50000")
    List<Employee> getHighSalaryEmployees();


    // Native SQL Query
    @Query(
            value = "SELECT * FROM employee WHERE salary > 50000",
            nativeQuery = true
    )
    List<Employee> getEmployeesUsingNativeQuery();


    // Aggregate function - COUNT
    @Query("SELECT COUNT(e) FROM Employee e")
    long countEmployees();


    // Aggregate function - MAX salary
    @Query("SELECT MAX(e.salary) FROM Employee e")
    double findHighestSalary();

}