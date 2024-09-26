package com.ivoyant.arraylist;

import java.util.ArrayList;

public class SearchUsingCollectionsExample {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");

        boolean isPresent = fruits.contains("Banana");

        System.out.println(isPresent);
    }
}
