package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        int points = 0;
        int number = rollTheDice();
        while (number != 1) {
            System.out.println("You rolled a " + number + "!");
            points += number;
            System.out.println("Roll again? (yes/no)");
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes")) {
                number = rollTheDice();
            } else {
                break;
            }
        }
        if (number == 1) {
            System.out.println("You rolled a 1!");
            System.out.println("You got 0 points.");
        } else {
            System.out.println("You got " + points + " points.");
        }

    }

    public static int rollTheDice() {
        return (int) (Math.random() * 6) + 1;
    }


}
