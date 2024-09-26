package com.ivoyant.classesconstructors;

class Vehicle {
    String name = "Car";

    Vehicle(String name) {
        System.out.println(name);
    }
}

class Cars extends Vehicle {
    Cars() {
        super("Bike");//Accessing parent class parameterized method
        System.out.println(super.name);//Accessing the parent class variable
    }
}

public class SuperKeywordExample2 {
    public static void main(String[] args) {

        Cars cars = new Cars();
    }
}