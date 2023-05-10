package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name = "Zed A. Shaw";
        int age = 35;
        double height = 74;  // inches
        double weight = 180; // lbs
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";
        height = height * 2.54; //convert to cm
        weight = weight * 0.453592; //convert to kg

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", height) + " centimeters tall.");
        System.out.println("He's " + String.format("%.2f", weight) + " kilos heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + String.format("%.2f", height) + ", and " + String.format("%.2f", weight)
                + " I get " + String.format("%.2f", (age + height + weight)) + ".");
    }
}