package com.ivoyant.exceptionhandling;

// Custom unchecked exception
class InvalidSalaryException extends RuntimeException {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class CustomUncheckedExceptionExample {
    public static void checkSalary(double salary) {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative.");
        } else {
            System.out.println("Salary is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkSalary(-5000);  // This will trigger the custom exception
        } catch (InvalidSalaryException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}