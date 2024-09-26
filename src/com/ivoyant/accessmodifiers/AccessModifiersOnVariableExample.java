package com.ivoyant.accessmodifiers;

class Employee {
    int age = 10; //Accessed within the same package
    public String name = "Alice"; //Accessed anywhere from the project
    protected String designation = "Manager"; //Accessed within the package and subclass
    private String company = "XYZ"; //Accessed only within the same class

    void display() {
        System.out.println("Employee company = " + company);
    }
}

public class AccessModifiersOnVariableExample {
    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Employee age = " + employee.age);
        System.out.println("Employee name = " + employee.name);
        System.out.println("Employee designation = " + employee.designation);

        employee.display();
    }
}
