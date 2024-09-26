package com.ivoyant.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter object with the path to the file
            FileWriter writer = new FileWriter("example.txt");

            // Write some character data to the file
            writer.write("Hello, this is an example of FileWriter.\n");
            writer.write("It writes character data to a file.");

            // Close the writer to free resources
            writer.close();

            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        try {
            // Create a FileReader object with the path to the file
            FileReader reader = new FileReader("example.txt");

            int character;
            // Read and display characters one by one
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Close the reader to free resources
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}