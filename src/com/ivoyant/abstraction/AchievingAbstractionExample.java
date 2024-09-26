package com.ivoyant.abstraction;

interface AbstractionExample {
    void greet();
}

class AbstractClass implements AbstractionExample {
    public void greet() {
        System.out.println("Abstraction achieved using interface");
    }
}

public class AchievingAbstractionExample {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass();

        abstractClass.greet();

    }
}
