package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Employee;

import java.util.List;

public interface EmployeeCriteriaRepository {

    List<Employee> findEmployeeByCriteria(String name, Double salary);

}