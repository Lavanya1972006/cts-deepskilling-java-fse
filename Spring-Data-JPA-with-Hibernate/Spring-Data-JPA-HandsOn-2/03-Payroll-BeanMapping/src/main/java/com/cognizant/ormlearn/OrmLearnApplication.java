package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {


    @Autowired
    private EmployeeRepository employeeRepository;


    @Autowired
    private DepartmentRepository departmentRepository;


    public static void main(String[] args) {

        SpringApplication.run(OrmLearnApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {


        // Employee Test
        Employee employee = employeeRepository.findById(1).get();

        System.out.println("Employee Name : " + employee.getName());


        // Department - Employee Mapping Test
        Department department = departmentRepository.findById(2).get();

        System.out.println("Department Name : " + department.getName());

        System.out.println("Employees : ");

        department.getEmployees().forEach(emp -> {
            System.out.println(emp.getName());
        });


        // Employee - Skill Mapping Test

        System.out.println("Skills : ");

        employee.getSkills().forEach(skill -> {
            System.out.println(skill.getName());
        });

    }

}