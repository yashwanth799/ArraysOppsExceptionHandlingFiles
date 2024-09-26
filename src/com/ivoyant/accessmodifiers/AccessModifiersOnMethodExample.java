package com.ivoyant.accessmodifiers;

class Employees {
    // Default Method - accessible within the same package
    void displayAge() {
        System.out.println("Default Access Modifier: Age is 30.");
    }

    // Public method - accessible anywhere
    public void displayName() {
        System.out.println("Public Access Modifier: Name is Alice.");
    }

    // Protected method - accessible within the same package
    protected void displayDesignation() {
        System.out.println("Protected Access Modifier: Designation is Manager.");
    }

    // Private method Accessible within the same class
    private void displayCompany() {
        System.out.println("Private Access Modifier: Company is XYZ.");
    }

    public void showCompany() {
        displayCompany();
    }
}

public class AccessModifiersOnMethodExample {
    public static void main(String[] args) {
        Employees employee = new Employees();

        employee.displayAge();
        employee.displayName();
        employee.displayDesignation();

        employee.showCompany(); // This will call the private method internally
    }
}
