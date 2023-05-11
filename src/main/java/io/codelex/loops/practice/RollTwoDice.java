package io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter desired sum: ");
        int desiredSum = input.nextInt();
        while (desiredSum <= 0 || desiredSum > 12) {
            System.out.println("Desired sum must be between 2 to 12: ");
            desiredSum = input.nextInt();
        }
        int num1 = rollTheDice();
        int num2 = rollTheDice();
        while (num1 + num2 != desiredSum) {
            System.out.println(num1 + " and " + num2 + " = " + (num1 + num2));
            num1 = rollTheDice();
            num2 = rollTheDice();
        }
        System.out.println(num1 + " and " + num2 + " = " + (num1 + num2));
    }

    public static int rollTheDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
