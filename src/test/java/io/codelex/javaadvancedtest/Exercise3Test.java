package io.codelex.javaadvancedtest;

import io.codelex.javaadvancedtest.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Exercise3Test {
    @Test
    public void shouldJoinIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        Assertions.assertEquals("1-2-3-4", joiner.join(1, 2, 3, 4));
    }

    @Test
    public void shouldJoinLocalDate() {
        Joiner<LocalDate> joiner = new Joiner<>("===");
        Assertions.assertEquals("2023-06-14===2023-06-15", joiner.join(LocalDate.of(2023, 06, 14), LocalDate.of(2023, 06, 15)));
    }
}
