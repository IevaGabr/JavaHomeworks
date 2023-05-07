package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes:");
        long minutes = input.nextLong();
        int minutesInDay = 60*24;
        int minutesInYear = minutesInDay*365;
        long years = (minutes - minutes%minutesInYear)/minutesInYear;
        long days = ((minutes - years*minutesInYear) - (minutes - years*minutesInYear)%minutesInDay)/minutesInDay;
        System.out.println(minutes + " minutes are " + years + " years and " + days + " days.");
    }
}
