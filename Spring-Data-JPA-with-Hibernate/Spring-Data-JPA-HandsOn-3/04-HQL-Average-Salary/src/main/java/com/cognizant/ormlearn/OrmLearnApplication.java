package com.cognizant.ormlearn;

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
        testGetAverageSalary();
    }

    private void testGetAverageSalary() {

        LOGGER.info("Start");

        int departmentId = 1;

        double averageSalary = employeeService.getAverageSalary(departmentId);

        LOGGER.info("Average Salary of Department {} : {}", departmentId, averageSalary);

        LOGGER.info("End");
    }
}