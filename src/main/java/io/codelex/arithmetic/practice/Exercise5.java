package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100 + 1);
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int num = input.nextInt();
        if (num == randomNum) {
            System.out.println("You guessed it!");
        } else if (num < randomNum) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNum + ".");
        } else {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNum + ".");
        }
    }
}
