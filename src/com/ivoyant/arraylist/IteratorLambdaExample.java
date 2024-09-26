package com.ivoyant.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //Accessing the elements using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //Accessing the elements using Lambda Expression
        numbers.forEach(number -> System.out.print(number + " "));
    }
}