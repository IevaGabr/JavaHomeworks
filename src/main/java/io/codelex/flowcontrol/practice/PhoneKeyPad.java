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
            } else {
                System.out.print(9);
            }
        }
        System.out.println();

        for (String s : textArray) {
            switch (s) {
                case "a":
                case "b":
                case "c":
                    System.out.print(2);
                    break;
                case "d":
                case "e":
                case "f":
                    System.out.print(3);
                    break;
                case "g":
                case "h":
                case "i":
                    System.out.print(4);
                    break;
                case "j":
                case "k":
                case "l":
                    System.out.print(5);
                    break;
                case "m":
                case "n":
                case "o":
                    System.out.print(6);
                    break;
                case "p":
                case "q":
                case "r":
                case "s":
                    System.out.print(7);
                    break;
                case "t":
                case "u":
                case "v":
                    System.out.print(8);
                    break;
                case "w":
                case "x":
                case "y":
                case "z":
                    System.out.print(9);
                    break;
            }
        }
    }
}
