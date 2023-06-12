package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PrinterTest {

    @Test
    public void shouldAcceptInteger() {
        Printer<Integer> thing = new Printer<>(12);
        ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
        thing.print();
        Assertions.assertEquals(12 + "\r\n", systemOutContent.toString());
    }

    @Test
    public void shouldAcceptBigDecimal() {
        Printer<BigDecimal> thing = new Printer<>(new BigDecimal("25"));
        ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
        thing.print();
        Assertions.assertEquals("25\r\n", systemOutContent.toString());
    }

    @Test
    public void shouldAcceptString() {
        Printer<String> thing = new Printer<>("Any text");
        ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
        thing.print();
        Assertions.assertEquals("Any text\r\n", systemOutContent.toString());
    }

    @Test
    public void shouldAcceptLocalDate() {
        Printer<LocalDate> thing = new Printer<>(LocalDate.of(2023, 06, 12));
        ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
        thing.print();
        Assertions.assertEquals("2023-06-12\r\n", systemOutContent.toString());
    }

    @Test
    public void shouldGetThingToPrint() {
        Printer<String> thing = new Printer<>("Any text");
        Assertions.assertEquals("Any text", thing.getThingToPrint());
    }
}
