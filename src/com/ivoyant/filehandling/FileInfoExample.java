package com.ivoyant.filehandling;

import java.io.File;
import java.io.IOException;

public class FileInfoExample {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\HP\\OneDrive\\Desktop\\myFile.txt");
        try {
            myFile.createNewFile();
        }catch (IOException e) {
            System.out.println("File not reated");
        }
        if (myFile.exists()) {
            System.out.println("Filename " + myFile.getName());
            System.out.println("Location " + myFile.getAbsolutePath());
            System.out.println("Can Writeable " + myFile.canWrite());
            System.out.println("Can Readable " + myFile.canRead());
            System.out.println("Size " + myFile.length());
        } else {
            System.out.println("File Doesn't exist");
        }
    }
}