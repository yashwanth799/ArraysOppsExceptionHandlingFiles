package com.ivoyant.exceptionhandling;

// Custom checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomCheckedExceptionExample {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // This will trigger the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}