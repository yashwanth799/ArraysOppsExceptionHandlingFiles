package com.ivoyant.inheritance;

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}