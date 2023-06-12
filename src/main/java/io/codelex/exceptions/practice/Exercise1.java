package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            int numerator = 0;
            try {
                numerator = scanner.nextInt();
            } catch (InputMismatchException e) {
                if (scanner.next().toLowerCase().startsWith("q")) {
                    System.out.println("Program is closing");
                    exit(0);
                } else {
                    System.out.println("You entered bad data. \nPlease try again");
                    System.out.println("Enter the numerator");
                    numerator = scanner.nextInt();
                }
            }
            System.out.println("Enter the divisor");
            int divisor = 1;
            try {
                divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (InputMismatchException ex) {
                scanner.nextLine();
                System.out.println("You entered bad data. \nPlease try again");
            }
        }
    }


}



