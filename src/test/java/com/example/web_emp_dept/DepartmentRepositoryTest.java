package com.example.web_emp_dept;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentRepositoryTest {

    /*
    application.properties i src/test/resources overrider
    automatisk den i src/main/resources
     */
    @Autowired
    DepartmentRepository repository;
    @Test
    void getDepartment10() throws SQLException {
        Department found = repository.getDepartment(10);
        assertEquals("ACCOUNTINGX", found.getName());
    }
}