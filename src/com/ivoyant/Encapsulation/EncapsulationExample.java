package com.ivoyant.Encapsulation;

class Employees {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employees employees = new Employees();

        employees.setId(10);
        employees.setName("Alice");

        System.out.println("Employee Id = " + employees.getId() + " Employee name = " + employees.getName());
    }
}