package com.ivoyant.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Overridden method compareTo method to sort the values
    @Override
    public int compareTo(Person other) {
        //This line is to sort the string data alphabetical order
        return this.name.compareTo(other.name);
        // return this.age - other.age; sort the integer in ascending order
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("yash", 25));
        people.add(new Person("Adarsh", 22));
        people.add(new Person("Rahul", 23));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}