package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.println("Enter single digit number:");
            num = input.nextInt();
            sum = sum + num;
        } while (num >= 0 && num < 10);
        System.out.println("Entered single digit number sum is " + sum);


    }
}
