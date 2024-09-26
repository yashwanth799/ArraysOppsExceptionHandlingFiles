package com.ivoyant.arrays;

import java.util.Arrays;

public class SearchUsingArraysExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int index = Arrays.binarySearch(arr, 30);

        System.out.println("The value present at index = " + index);
    }
}