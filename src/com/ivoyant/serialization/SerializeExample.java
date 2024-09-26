package com.ivoyant.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;  // Recommended for Serializable classes
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Person{name = " + name + " age = " + age + "}";
    }
}

public class SerializeExample {
    public static void main(String[] args) {

        Person person = new Person(25, "Alice");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serializable.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);
            System.out.println("The object is serialized " + person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}