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

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testGetAllPermanentEmployees();
    }

    private void testGetAllPermanentEmployees() {

        LOGGER.info("Start");

        List<Employee> employees = employeeService.getAllPermanentEmployees();

        LOGGER.info("Permanent Employees:");

        for (Employee employee : employees) {

            LOGGER.info(employee.toString());

            if (employee.getDepartment() != null) {
                LOGGER.info("Department : {}", employee.getDepartment().getName());
            }

            if (employee.getSkills() != null) {
                LOGGER.info("Skills : {}", employee.getSkills());
            }
        }

        LOGGER.info("End");
    }
}