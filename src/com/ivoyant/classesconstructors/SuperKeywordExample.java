package com.ivoyant.classesconstructors;

class Mobile {
    Mobile() {
        System.out.println("Samsung Mobile");
    }

    void display() {
        System.out.println("Redmi mobile");
    }
}

class Charger extends Mobile {
    Charger() {
        super(); //Calling constructor of parent class
        System.out.println("Samsung charger");
    }

    void display() {
        super.display();// Calling parent class method
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {

        Charger charger = new Charger();
        charger.display();
    }
}