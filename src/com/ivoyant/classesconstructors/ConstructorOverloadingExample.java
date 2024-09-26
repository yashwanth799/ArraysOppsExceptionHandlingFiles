package com.ivoyant.classesconstructors;

class Animal {
    int age;
    String animalName;

    Animal(int age) {
        this.age = age;
        this.animalName = "Dog";
    }

    Animal(String animalName) {
        this.age = 12;
        this.animalName = animalName;
    }

    Animal(int age, String animalName) {
        this.age = age;
        this.animalName = animalName;
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {

        Animal animal = new Animal(10);
        Animal animal1 = new Animal("Cat");
        Animal animal2 = new Animal(15, "Horse");

        System.out.println("Animal age = " + animal.age + "\nAnimal Name = " + animal.animalName);
        System.out.println("Animal age = " + animal1.age + "\nAnimal Name = " + animal1.animalName);
        System.out.println("Animal age = " + animal2.age + "\nAnimal Name = " + animal2.animalName);
    }
}