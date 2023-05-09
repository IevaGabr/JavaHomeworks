package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println(acceptNumber(num1, num2));;
    }

    public static boolean acceptNumber (int num1, int num2){
        return num1 == 15 || num2 == 15 || num1+num2 == 15 || Math.abs(num1-num2) == 15;
    }
}
