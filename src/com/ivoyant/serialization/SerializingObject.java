package com.ivoyant.serialization;

import java.io.*;

public class SerializingObject {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.age = 25;
        obj.name = "yashwanth";

        FileOutputStream fl = null;
        ObjectOutputStream oos = null;
        try {
            fl = new FileOutputStream("obj.txt");
            oos = new ObjectOutputStream(fl);
            oos.writeObject(obj);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception occured");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("IO exception at closing a file");
                }
            }
        }

        FileInputStream fi = null;
        ObjectInputStream ois = null;
        try {
            fi = new FileInputStream("obj.txt");
            ois = new ObjectInputStream(fi);
            Employee obj1 = (Employee) ois.readObject();

            System.out.println(obj1.age + " " + obj1.name);
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }

        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}

class Employee implements Serializable {
    int age;
    String name;
}