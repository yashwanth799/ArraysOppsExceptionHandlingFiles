package com.ivoyant.arrays;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int[] newNumbers = Arrays.copyOf(numbers, 2);

        for (int num : newNumbers) {
            System.out.print(num + " ");
        }
    }
}
