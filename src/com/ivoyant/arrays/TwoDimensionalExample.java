package com.ivoyant.arrays;

public class TwoDimensionalExample {
    public static void main(String[] args) {

        //Declaring the two dimensional array
        int[][] arr=new int[5][5];

        //Accessing the array and adding the elements to it
        for(int i= 0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = j;
            }
        }

        //Accessing the array and printing the elements
        for(int i= 0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}