package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter min: ");
        int min = input.nextInt();
        System.out.println("Enter max: ");
        int max = input.nextInt();
        for (int i = min; i <= max; i++) {
            for (int j = min; j <= max; j++) {
                if (i + j - min > max) {
                    System.out.print(i + j - min - max);
                } else {
                    System.out.print(i + j - min);
                }
            }
            System.out.println();
        }
    }
}
