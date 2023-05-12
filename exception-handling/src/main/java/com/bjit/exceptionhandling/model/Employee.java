package com.bjit.exceptionhandling.model;

public class Employee {

    private int id;
    private String EmployeeName;

    public Employee(int id, String employeeName) {
        this.id = id;
        EmployeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }



}
