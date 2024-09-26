package com.ivoyant.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollectionsExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        Collections.sort(numbers);
        numbers.forEach(number -> System.out.print(number + " "));
    }
}