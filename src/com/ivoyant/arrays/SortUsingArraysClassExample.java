package com.ivoyant.arrays;

import java.util.Arrays;

public class SortUsingArraysClassExample {
    public static void main(String[] args) {

        int[] arr = {90, 70, 50, 30, 80, 60, 10, 40, 20};

        System.out.println("Values before sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Using arrays class to sort the elements
        Arrays.sort(arr);

        System.out.println("Values after sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int[] arr1 = {90, 70, 50, 30, 80, 60, 10, 40, 20};

        System.out.println("Values before sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}