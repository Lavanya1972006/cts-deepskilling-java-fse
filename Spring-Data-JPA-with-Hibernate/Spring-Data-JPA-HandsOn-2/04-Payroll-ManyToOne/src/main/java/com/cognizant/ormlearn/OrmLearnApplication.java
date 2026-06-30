package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) throws Exception {

        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        // Uncomment only one test method at a time

        testGetEmployee();

        // testAddEmployee();

        // testUpdateEmployee();
    }

    private static void testGetEmployee() {

        LOGGER.info("Start");

        Employee employee = employeeService.get(1);

        LOGGER.debug("Employee : {}", employee);
        LOGGER.debug("Department : {}", employee.getDepartment());

        LOGGER.info("End");
    }

    private static void testAddEmployee() throws Exception {

        LOGGER.info("Start");

        Employee employee = new Employee();

        employee.setName("Rahul");
        employee.setSalary(50000);
        employee.setPermanent(true);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        employee.setDateOfBirth(sdf.parse("15/08/2000"));

        Department department = departmentService.get(1);

        employee.setDepartment(department);

        employeeService.save(employee);

        LOGGER.debug("Employee : {}", employee);

        LOGGER.info("End");
    }

    private static void testUpdateEmployee() {

        LOGGER.info("Start");

        Employee employee = employeeService.get(1);

        Department department = departmentService.get(2);

        employee.setDepartment(department);

        employeeService.save(employee);

        LOGGER.debug("Employee : {}", employee);

        LOGGER.info("End");
    }
}