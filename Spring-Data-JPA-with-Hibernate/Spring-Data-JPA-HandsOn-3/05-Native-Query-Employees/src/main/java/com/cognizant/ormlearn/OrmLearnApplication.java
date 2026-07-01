package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testGetAllEmployeesNative();
    }

    private void testGetAllEmployeesNative() {

        LOGGER.info("Start");

        List<Employee> employees = employeeService.getAllEmployeesNative();

        LOGGER.info("Employee Details");

        for (Employee employee : employees) {

            LOGGER.info("Employee ID      : {}", employee.getId());
            LOGGER.info("Employee Name    : {}", employee.getName());
            LOGGER.info("Salary           : {}", employee.getSalary());
            LOGGER.info("Permanent        : {}", employee.isPermanent());
            LOGGER.info("Date of Birth    : {}", employee.getDateOfBirth());

            if (employee.getDepartment() != null) {
                LOGGER.info("Department       : {}", employee.getDepartment().getName());
            }

            if (employee.getSkills() != null) {
                LOGGER.info("Skills           : {}", employee.getSkills());
            }

            LOGGER.info("------------------------------------------------");
        }

        LOGGER.info("End");
    }
}