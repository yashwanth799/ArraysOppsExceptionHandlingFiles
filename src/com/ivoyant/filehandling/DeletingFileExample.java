package com.ivoyant.filehandling;

import java.io.File;

public class DeletingFileExample {
    public static void main(String[] args) {
        File myFile = new File("MyFile.txt");
        if(myFile.delete())
        {
            System.out.println("The file deleted successfully"+myFile.getName());
        }
        else {
            System.out.println("Some error occured");
        }
    }
}