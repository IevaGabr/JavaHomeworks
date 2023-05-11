package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = input.nextLine();
        System.out.println("Enter second word: ");
        String word2 = input.nextLine();
        System.out.print(word1);
        for (int i = 1; i <= 30 - word1.length() - word2.length(); i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }
}
