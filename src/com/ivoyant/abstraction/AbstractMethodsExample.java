package com.ivoyant.abstraction;

interface Tv {
    void display(); //Abstract method at interface level
}

abstract class SmartTv {
    abstract void greeting(); //Abstract method at class level
}

class Gadgets extends SmartTv implements Tv {
    void greeting() {
        System.out.println("Hello!");
    }

    public void display() {
        System.out.println("Interface abstract method");
    }
}

public class AbstractMethodsExample {
    public static void main(String[] args) {
        Gadgets gadgets = new Gadgets();

        gadgets.greeting();
        gadgets.display();

    }
}
