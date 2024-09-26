package com.ivoyant.advanceoopcocepts;

class StaticExample{
    static int count; //Declaring static variable

    void counting()
    {
        count++;
    }

    static void display(){ //Static method
        System.out.println(count);
    }

    static { //Static block
        System.out.println("Static block executing");
    }

}
public class StaticVariablesMethods {
    public static void main(String[] args) {

        StaticExample staticExample = new StaticExample();
        staticExample.counting();
        staticExample.counting();
        staticExample.counting();

        StaticExample.display(); //Calling static method with class name

        System.out.println(StaticExample.count); //Calling Static variable with class name
    }
}
