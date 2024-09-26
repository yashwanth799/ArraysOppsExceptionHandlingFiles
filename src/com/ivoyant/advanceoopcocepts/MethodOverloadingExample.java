package com.ivoyant.advanceoopcocepts;

public class MethodOverloadingExample {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    float add(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();

        int sum = methodOverloadingExample.add(10, 20);
        float result = methodOverloadingExample.add(12.5f, 15.6f);

        System.out.println("The sum of integer values = " + sum);
        System.out.println("The sum of float valuse = " + result);
    }
}
