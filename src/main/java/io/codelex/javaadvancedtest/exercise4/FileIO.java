package io.codelex.javaadvancedtest.exercise4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileIO {
    public static void main(String[] args) throws IOException {
        String pathToApp = "src\\main\\resources\\javaadvancedtest\\exercise4\\";
        String fileNameToRead = "FileToRead";
        Path pathToRead = Paths.get(pathToApp + fileNameToRead + ".txt");
        String fileNameToWrite = "";
        String[] fileNameToReadArray = fileNameToRead.split("");
        for (int i = fileNameToReadArray.length - 1; i >= 0; i--) {
            fileNameToWrite = fileNameToWrite + fileNameToReadArray[i];
        }
        Path pathToWrite = Paths.get(pathToApp + fileNameToWrite + ".txt");
        Files.createFile(pathToWrite);
        List<String> linesToRead = Files.readAllLines(pathToRead);
        for (int i = linesToRead.size() - 1; i >= 0; i--) {
            String[] lineArray = linesToRead.get(i).split("");
            String lineToWrite = "";
            for (int j = lineArray.length - 1; j >= 0; j--) {
                lineToWrite = lineToWrite + lineArray[j];
            }
            if (i != 0) {
                lineToWrite = lineToWrite + "\n";
            }
            Files.write(pathToWrite, lineToWrite.getBytes(), StandardOpenOption.APPEND);
        }

    }
}
