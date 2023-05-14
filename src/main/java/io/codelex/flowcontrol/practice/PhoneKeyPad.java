package io.codelex.flowcontrol.practice;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine().toLowerCase();
        String[] textArray = text.split("");
        for (String value : textArray) {
            if (value.equals("a") || value.equals("b") || value.equals("c")) {
                System.out.print(2);
            } else if (value.equals("d") || value.equals("e") || value.equals("f")) {
                System.out.print(3);
            } else if (value.equals("g") || value.equals("h") || value.equals("i")) {
                System.out.print(4);
            } else if (value.equals("j") || value.equals("k") || value.equals("l")) {
                System.out.print(5);
            } else if (value.equals("m") || value.equals("n") || value.equals("o")) {
                System.out.print(6);
            } else if (value.equals("p") || value.equals("q") || value.equals("r") || value.equals("s")) {
                System.out.print(7);
            } else if (value.equals("t") || value.equals("u") || value.equals("v")) {
                System.out.print(8);
            } else if (value.equals("w") || value.equals("x") || value.equals("y") || value.equals("z")) {
                System.out.print(9);
            }
        }
        System.out.println();

        for (String s : textArray) {
            switch (s) {
                case "a", "b", "c" -> System.out.print(2);
                case "d", "e", "f" -> System.out.print(3);
                case "g", "h", "i" -> System.out.print(4);
                case "j", "k", "l" -> System.out.print(5);
                case "m", "n", "o" -> System.out.print(6);
                case "p", "q", "r", "s" -> System.out.print(7);
                case "t", "u", "v" -> System.out.print(8);
                case "w", "x", "y", "z" -> System.out.print(9);
            }
        }
    }
}
