package com.ivoyant.filehandling;

import java.io.*;

public class BufferReaderAndWriterPracticeExample {
    public static void main(String[] args) {

        try {
            FileReader input = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(input);

            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
            bufferedReader.close();
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Io Exceptiom");
        }
    }
}