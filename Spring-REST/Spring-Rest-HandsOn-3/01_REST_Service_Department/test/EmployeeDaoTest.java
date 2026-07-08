package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.cognizant.springlearn.dao.EmployeeDao;

public class EmployeeDaoTest {

    @Test
    public void testEmployeeList() {

        EmployeeDao dao = new EmployeeDao();

        assertNotNull(dao.getAllEmployees());

        dao.getAllEmployees().forEach(System.out::println);
    }
}
