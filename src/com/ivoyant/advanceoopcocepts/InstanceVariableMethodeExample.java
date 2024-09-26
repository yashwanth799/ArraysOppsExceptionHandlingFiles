package com.ivoyant.advanceoopcocepts;

class InstanceVariableMethods {
    int count;  //Instance variable
    String name;

    void initializeValue(int count, String name) //Instance method
    {
        this.count += count;
        this.name = name;
    }

    //Instance block
    {
        count++;
    }
}

public class InstanceVariableMethodeExample {
    public static void main(String[] args) {
        InstanceVariableMethods instanceVariableMethods = new InstanceVariableMethods();

        instanceVariableMethods.initializeValue(1, "Alice");
        instanceVariableMethods.initializeValue(1, "Bob");

        System.out.println(instanceVariableMethods.count);
        System.out.println(instanceVariableMethods.name);
    }
}
