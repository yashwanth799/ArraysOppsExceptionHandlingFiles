package com.ivoyant.filehandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterFileExample {
    public static void main(String[] args) {
        FileWriter myFile = null;
        BufferedWriter bw = null;
        try {
            myFile = new FileWriter("MyFile.txt");
            bw = new BufferedWriter(myFile);
            bw.write("Hello Welcome to world of Java");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception occured");
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (myFile != null) {
                    myFile.close();
                }
            } catch (IOException e) {
                System.out.println("IO Exception occured while closing");
            }
        }
    }
}