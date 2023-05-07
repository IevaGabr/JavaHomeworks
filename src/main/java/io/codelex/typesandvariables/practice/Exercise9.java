package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in meters:");
        int meters = input.nextInt();
        System.out.println("Enter hours:");
        int hours = input.nextInt();
        System.out.println("Enter minutes:");
        int minutes = input.nextInt();
        System.out.println("Enter seconds:");
        int seconds = input.nextInt();
        double kilometers = (double) meters / 1000;
        double miles = (double) meters / 1609;
        double secondsForSpeed = seconds + (hours * 60 + minutes)*60;
        double speedMetersInSeconds = (double) meters /secondsForSpeed;
        System.out.println("Your speed in meters/seconds is " + String.format("%.8f",speedMetersInSeconds)
                .replace(",", "."));
        double hoursForSpeed = hours + (double) minutes/60 + (double) seconds/3600;
        double speedKilometresInHour = kilometers/hoursForSpeed;
        System.out.println("Your speed in km/h is " + String.format("%.8f", speedKilometresInHour)
                .replace(",", "."));
        double speedMilesInHour = miles/hoursForSpeed;
        System.out.println("Your speed in miles/h is " + String.format("%.8f", speedMilesInHour)
                .replace(",", "."));
    }
}
