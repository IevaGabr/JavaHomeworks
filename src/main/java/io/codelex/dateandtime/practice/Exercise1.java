package io.codelex.dateandtime.practice;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 4, 15);
        LocalDate date2 = LocalDate.of(2023, 5, 23);

        System.out.println("From " + date1 + " to " + date2 + " employee works " + calculateWorkingHours(date1, date2) + " hours.");

    }

    public static int calculateWorkingHours(LocalDate date1, LocalDate date2) {
        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(2023, 1, 1));
        holidays.add(LocalDate.of(2023, 4, 7));
        holidays.add(LocalDate.of(2023, 4, 9));
        holidays.add(LocalDate.of(2023, 4, 10));
        holidays.add(LocalDate.of(2023, 5, 1));
        holidays.add(LocalDate.of(2023, 5, 4));
        holidays.add(LocalDate.of(2023, 6, 23));
        holidays.add(LocalDate.of(2023, 6, 24));
        holidays.add(LocalDate.of(2023, 11, 18));
        holidays.add(LocalDate.of(2023, 12, 24));
        holidays.add(LocalDate.of(2023, 12, 25));
        holidays.add(LocalDate.of(2023, 12, 26));
        holidays.add(LocalDate.of(2023, 12, 31));

        List<LocalDate> listOfDays = date1.datesUntil(date2).collect(Collectors.toList());
        listOfDays.add(date2);
        listOfDays.removeAll(holidays);
        int countBusinessDays = 0;
        for (LocalDate day : listOfDays) {
            if (!day.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                countBusinessDays++;
            }
        }

        return countBusinessDays * 8;
    }


}
