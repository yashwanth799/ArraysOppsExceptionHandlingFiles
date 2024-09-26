package com.ivoyant.advanceoopcocepts;

class Message {
    void display() {
        System.out.println("Hello world!");
    }
}

class Greetings extends Message {
    @Override
    void display() {
        System.out.println("Overridden display method ");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {

        Message message = new Message();
        Greetings greetings = new Greetings();

        message.display();
        greetings.display();

    }
}
