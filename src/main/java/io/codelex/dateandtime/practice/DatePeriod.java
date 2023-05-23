package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DatePeriod {
    private LocalDate startDate;
    private LocalDate endDate;
    private List<LocalDate> period;

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<LocalDate> makeListOfPeriodDays(LocalDate start, LocalDate end) {
        period = start.datesUntil(end).collect(Collectors.toList());
        period.add(end);
        return period;
    }

    public boolean isOverlapping(DatePeriod datePeriod) {
        return datePeriod.getStartDate().toEpochDay() <= this.endDate.toEpochDay();
    }

    public DatePeriod intersection(DatePeriod datePeriod) {
        if (!isOverlapping(datePeriod)) {
            return null;
        } else {
            List<LocalDate> period1 = makeListOfPeriodDays(this.startDate, this.endDate);
            List<LocalDate> period2 = makeListOfPeriodDays(datePeriod.getStartDate(), datePeriod.getEndDate());
            if (period1.size() > period2.size()) {
                period1.retainAll(period2);
                return new DatePeriod(period1.get(0), period1.get(period1.size() - 1));
            } else {
                period2.retainAll(period1);
                return new DatePeriod(period2.get(0), period2.get(period2.size() - 1));
            }
        }
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
