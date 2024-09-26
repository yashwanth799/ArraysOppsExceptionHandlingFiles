package com.ivoyant.exceptionhandling;

public class MultiCatchBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] arr = {10, 20, 30};

            int number = arr[4];

            System.out.println(result + " " + number);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}