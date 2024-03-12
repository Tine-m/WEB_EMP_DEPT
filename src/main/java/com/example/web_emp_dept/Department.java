package com.example.web_emp_dept;

public class Department {
    private int deptno;
    private String name;
    private String loc;

    public Department(int deptno, String name, String loc) {
        this.deptno = deptno;
        this.name = name;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public String getName() {
        return name;
    }

    public String getLoc() {
        return loc;
    }
}

