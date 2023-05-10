package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number % 2 == 1) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
        System.out.println("Do you want check another number? (Enter: y/n)");
        String answer = input.next();
        while (answer.equals("y")) {
            System.out.println("Enter a number:");
            number = input.nextInt();
            if (number % 2 == 1) {
                System.out.println("Odd number");
            } else {
                System.out.println("Even number");
            }
            System.out.println("Do you want check another number? (Enter: y/n)");
            answer = input.next();
        }
        System.out.println("bye!");
    }
}
