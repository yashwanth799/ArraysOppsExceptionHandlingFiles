package com.ivoyant.exceptionhandling;

public class TryCatchExample {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}