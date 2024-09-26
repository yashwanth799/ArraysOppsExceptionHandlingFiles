package com.ivoyant.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutStreamExample {
    public static void main(String[] args) {

        try {
            FileInputStream myFile = new FileInputStream("MyFile.txt");
            FileOutputStream outFile = new FileOutputStream("outFile.txt");

            int i;
            while ((i = myFile.read()) != -1) {
                outFile.write(i);
            }
            System.out.println("copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}