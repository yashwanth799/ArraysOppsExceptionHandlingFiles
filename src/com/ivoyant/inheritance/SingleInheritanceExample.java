package com.ivoyant.inheritance;

// Parent class
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}

// Child class
class Car extends Vehicle {
    void drive() {
        System.out.println("The car drives.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Inherited method
        car.drive(); // Own method
    }
}