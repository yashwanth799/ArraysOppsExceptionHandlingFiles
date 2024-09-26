package com.ivoyant.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("serializable.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person = (Person) objectInputStream.readObject();
            System.out.println("Object has been Deserialized " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}