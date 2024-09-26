package com.ivoyant.classesconstructors;

class Student {
    int age;
    String name;

    Student() {
        this.age = 25;
        this.name = "Alice";
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.age + " " + student.name);
    }
}