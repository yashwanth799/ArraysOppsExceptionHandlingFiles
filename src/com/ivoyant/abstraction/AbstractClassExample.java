package com.ivoyant.abstraction;


abstract class Laptop {
    abstract void newFeature();

    void display() {
        System.out.println("Product under development");
    }
}

class Gadget extends Laptop {
    void newFeature() {
        System.out.println("Added new Feature");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();
        gadget.display();
        gadget.newFeature();
    }
}
