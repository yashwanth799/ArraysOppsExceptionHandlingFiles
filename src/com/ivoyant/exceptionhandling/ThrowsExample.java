package com.ivoyant.exceptionhandling;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class ThrowsExample {
    public static void main(String[] args) throws InvalidNumberException {
        int number = -5;
        try {
            if (number < 0) {
                throw new InvalidNumberException("Number cannot be negative.");
            } else {
                System.out.println("Number is valid: " + number);
            }
        } catch (InvalidNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}