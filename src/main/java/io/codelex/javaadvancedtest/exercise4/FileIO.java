package io.codelex.javaadvancedtest.exercise4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("C:\\Codelex_Java\\JavaHomeworks\\src\\main\\resources\\javaadvancedtest\\exercise4\\FileToRead.txt");
        FileWriter out = new FileWriter("C:\\Codelex_Java\\JavaHomeworks\\src\\main\\resources\\javaadvancedtest\\exercise4\\FileToWrite.txt");
        int nextChar;
        while ((nextChar = in.read()) != -1) {

        }
        in.close();
        out.close();
    }
}
