package com.example.web_emp_dept;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = WebEmpDeptApplication.class)
public class DevActiveProfileUnitTest {

    @Value("${profile.property.value}")
    private String propertyString;

    @Test
    void whenDevIsActive_thenValueShouldBeKeptFromApplicationYaml() {
        Assertions.assertEquals("This the the application.yaml file", propertyString);
    }
}
