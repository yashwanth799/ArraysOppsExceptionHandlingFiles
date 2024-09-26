package com.ivoyant.arrays;

import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {

        //This array have the different number of columns
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];

        System.out.println("Enter the values");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}