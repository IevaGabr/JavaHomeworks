package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of day: ");
        int dayNumber = input.nextInt();
        if (dayNumber < 0 || dayNumber > 6) {
            System.out.println("Not a valid day");
        } else {
            if (dayNumber == 0) {
                System.out.println("Sunday");
            } else if (dayNumber == 1) {
                System.out.println("Monday");
            } else if (dayNumber == 2) {
                System.out.println("Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Friday");
            } else {
                System.out.println("Saturday");
            }
        }

        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day");
        }
    }
}
