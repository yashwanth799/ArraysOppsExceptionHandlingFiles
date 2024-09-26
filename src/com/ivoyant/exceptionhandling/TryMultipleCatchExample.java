package com.ivoyant.exceptionhandling;


public class TryMultipleCatchExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            int[] arr = {10, 20, 30};

            int number = arr[4];

            System.out.println(result + " " + number);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}