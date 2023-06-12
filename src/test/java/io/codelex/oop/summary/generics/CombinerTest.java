package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CombinerTest {
    @Test
    public void shouldAcceptInteger() {
        Integer value1 = 12;
        Integer value2 = 15;
        String result = Combiner.combineTwoItems(value1, value2);
        Assertions.assertEquals("First item: 12; Second item: 15", result);
    }

    @Test
    public void shouldAcceptBigDecimal() {
        BigDecimal value1 = new BigDecimal("12");
        BigDecimal value2 = new BigDecimal("15");
        String result = Combiner.combineTwoItems(value1, value2);
        Assertions.assertEquals("First item: 12; Second item: 15", result);
    }

    @Test
    public void shouldAcceptString() {
        String text1 = "12";
        String text2 = "15";
        String result = Combiner.combineTwoItems(text1, text2);
        Assertions.assertEquals("First item: 12; Second item: 15", result);
    }

    @Test
    public void shouldAcceptLocaldate() {
        LocalDate date1 = LocalDate.of(2023, 06, 10);
        LocalDate date2 = LocalDate.of(2023, 06, 11);
        String result = Combiner.combineTwoItems(date1, date2);
        Assertions.assertEquals("First item: 2023-06-10; Second item: 2023-06-11", result);
    }
}
