package com.ivoyant.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFileExample {
    public static void main(String[] args) throws FileNotFoundException {
       /* File myFile = new File("MyFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }*/
        try {
            FileReader reader = new FileReader("MyFile.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}