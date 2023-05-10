package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a text!");
        String text = input.nextLine();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.codePointAt(i) >= 65 && text.codePointAt(i) <= 90) {
                counter = counter + 1;
            }
        }
        System.out.println("Uppercase letters in text: " + counter);
    }
}
