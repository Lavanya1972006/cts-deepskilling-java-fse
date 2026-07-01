package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeCriteriaRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeCriteriaRepository employeeCriteriaRepository;


    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {

        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }


    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();

    }


    public List<Employee> searchEmployee(String name, Double salary) {

        return employeeCriteriaRepository
                .findEmployeeByCriteria(name, salary);

    }

}