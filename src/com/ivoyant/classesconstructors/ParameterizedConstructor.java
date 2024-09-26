package com.ivoyant.classesconstructors;

class Employee {
    int employeeId;
    String employeeName;

    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {

        Employee employee = new Employee(100, "Bob");

        System.out.println("Employee Id : " + employee.employeeId + "\nEmployee Name :" + employee.employeeName);
    }
}