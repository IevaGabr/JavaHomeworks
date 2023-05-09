package io.codelex.arithmetic.practice;

import java.util.Arrays;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 110;
        for (int i = startNumber; i <= endNumber ; i++) {
            if (i % 7 == 0 && i % 5 == 0 && i % 3 == 0){
                System.out.print("CozaLozaWoza ");
            } else if (i % 7 == 0 && i % 5 == 0) {
                System.out.print("LozaWoza ");
            } else if (i % 7 == 0 && i % 3 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0){
                System.out.println();
            }
        }

    }
}
