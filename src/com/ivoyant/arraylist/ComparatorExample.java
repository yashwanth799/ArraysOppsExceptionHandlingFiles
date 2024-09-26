package com.ivoyant.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(100, "Charlie"));

        // Use an anonymous Comparator to sort students by name
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name); // Sort alphabetically by name
            }
        });

        for (Student student : students) {
            System.out.println(student);
        }
    }
}