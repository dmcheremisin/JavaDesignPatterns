package com.dmch.uml;

import java.util.HashSet;
import java.util.Set;

public class Department implements PersonsCounter {
    private String name;
    private Set<Employee> employees = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Employee> getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setDepartment(this);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public int getPersonCount() {
        return employees.size();
    }
}
