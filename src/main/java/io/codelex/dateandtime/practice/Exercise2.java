package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter server launch day: ");
        int dayOfLaunch = input.nextInt();
        System.out.println("Enter server launch month: ");
        int monthOfLaunch = input.nextInt();
        System.out.println("Enter server launch year: ");
        int yearOfLaunch = input.nextInt();
        LocalDate launchDate = LocalDate.of(yearOfLaunch, monthOfLaunch, dayOfLaunch);
        System.out.println("Enter server update month: ");
        int updateMonth = input.nextInt();
        System.out.println("Enter server upedate year: ");
        int updateYear = input.nextInt();
        calculateServerUpdateDays(launchDate, updateMonth, updateYear);

    }

    public static void calculateServerUpdateDays(LocalDate launchDate, int month, int year) {
        LocalDate serverUpdateDay = launchDate.plusDays(14);
        while (serverUpdateDay.getMonthValue() != month && serverUpdateDay.getYear() == year) {
            serverUpdateDay = serverUpdateDay.plusDays(14);
        }
        while (serverUpdateDay.getMonthValue() == month && serverUpdateDay.getYear() == year) {
            System.out.println(serverUpdateDay);
            serverUpdateDay = serverUpdateDay.plusDays(14);
        }
    }
}
