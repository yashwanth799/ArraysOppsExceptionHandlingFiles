package com.ivoyant.classesconstructors;

class Person {

    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class ClassInstanceExample {
    public static void main(String[] args) {

        Person person = new Person(25, "Bob");
        Person person1 = new Person(56, "Alice");

        System.out.println(person.age + " " + person.name);
        System.out.println(person1.age + " " + person1.name);
    }
}