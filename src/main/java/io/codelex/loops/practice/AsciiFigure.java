package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter figure size: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 8 * size - 8; j++) {
                if (j < 4 * size - 4 - 4 * i) {
                    System.out.print((char) 47);
                } else if (j >= 4 * size - 4 + 4 * i) {
                    System.out.print((char) 92);
                } else {
                    System.out.print((char) 42);
                }
            }
            System.out.println();
        }
    }
}
