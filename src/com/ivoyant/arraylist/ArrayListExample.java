package com.ivoyant.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //Values after adding
        System.out.println("ArrayList Values");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        numbers.remove(1);
        //values after removing
        System.out.println("ArrayList Values after removing index one value");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Accessing the value from the arraylist using index
        System.out.println("Accessing the index 3 value");
        System.out.println(numbers.get(3));
    }
}
