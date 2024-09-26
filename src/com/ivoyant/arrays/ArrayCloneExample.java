package com.ivoyant.arrays;

public class ArrayCloneExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] arr1 = arr.clone();

        for(int num : arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        for(int num : arr1)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}