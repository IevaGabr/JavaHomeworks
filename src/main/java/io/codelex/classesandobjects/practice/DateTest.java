package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date testDate = new Date(10, 21, 2022);
        System.out.println(testDate.getDay());
        System.out.println(testDate.getMonth());
        System.out.println(testDate.getYear());
        testDate.setDay(15);
        testDate.setMonth(5);
        testDate.setYear(2023);
        System.out.println(testDate.displayDate());
    }
}
