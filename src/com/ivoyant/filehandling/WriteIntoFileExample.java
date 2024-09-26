package com.ivoyant.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFileExample {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("MyFile.txt");
            myFile.write("My Second file");
            myFile.close();
        } catch (IOException e)
        {
            System.out.println("File not fount");
        }
    }
}