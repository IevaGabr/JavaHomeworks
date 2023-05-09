package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your height (cm):");
        int heightInCm = input.nextInt();
        System.out.println("Enter Your weight (kg):");
        double weightInKg = input.nextDouble();
        double BMI = calculateBMI(weightInKg, heightInCm);
        if (BMI < 18.5){
            System.out.println("Your BMI is " + String.format("%.1f",BMI).replace(",", ".")
                    + ". You are underweight.");
        } else if (BMI > 25) {
            System.out.println("Your BMI is " + String.format("%.1f",BMI).replace(",", ".")
                    + ". You are overweight.");
        } else {
            System.out.println("Your BMI is " + String.format("%.1f",BMI).replace(",", ".")
                    + ". You have optimal weight.");
        }
    }

    public static double calculateBMI (double weight, int height){
        double weightInPounds = weight * 2.205;
        double heightInInches = height / 2.54;
        return weightInPounds * 703 / Math.pow(heightInInches,2);

    }
}
