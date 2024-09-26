package com.ivoyant.arrays;

import java.util.Scanner;

public class OneDimensionalExample {
    public static void main(String[] args) {

        //initializing the array values
        int[] arr = {10, 20, 30, 40, 50};

        for (int numbers : arr) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        //declaring and giving the array size
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = i;
        }

        for (int numbers : arr1) {
            System.out.print(numbers + " ");
        }
        System.out.println();

        //Taking the input from the user for array size and the values into an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        System.out.println("Enter the array values");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int numbers : arr2) {
            System.out.print(numbers + " ");
        }
    }
}