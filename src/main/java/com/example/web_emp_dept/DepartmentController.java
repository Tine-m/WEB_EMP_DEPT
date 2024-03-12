package com.example.web_emp_dept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class DepartmentController {

    private DepartmentRepository repository;

    public DepartmentController(DepartmentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    //@ResponseBody
    public String findDepartmentById(Model model) throws SQLException {
        Department found = repository.getDepartment(10);
        model.addAttribute("dept", found);
        return "show";
    }
}
