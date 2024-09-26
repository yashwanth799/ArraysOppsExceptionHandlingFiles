package com.ivoyant.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyFile.txt");
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File not created" + e.getMessage());
        }
    }
}
