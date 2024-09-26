package com.ivoyant.inheritance;

class Vehicles {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Cars extends Vehicles {
    void honk() {
        System.out.println("Car is honking.");
    }
}

class Bike extends Vehicles {
    void rev() {
        System.out.println("Bike is revving.");
    }
}

interface Electric {
    void charge();
}

class ElectricCar extends Cars implements Electric {
    @Override
    public void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Creating objects
        Cars cars = new Cars();
        cars.start();
        cars.honk();

        Bike bike = new Bike();
        bike.start();
        bike.rev();

        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.honk();
        electricCar.charge();
    }
}