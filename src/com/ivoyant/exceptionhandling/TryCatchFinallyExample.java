package com.ivoyant.exceptionhandling;

public class TryCatchFinallyExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("This block will always executes whether exception occurred or not");
        }
    }
}