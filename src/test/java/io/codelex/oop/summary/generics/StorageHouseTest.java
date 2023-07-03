package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class StorageHouseTest {

    @Test
    public void shouldAcceptInteger() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(12);
        Assertions.assertEquals(12, storageHouse.getMaybeFirstItem().get());
    }

    @Test
    public void shouldAcceptBigDecimal() {
        StorageHouse<BigDecimal> storageHouse = new StorageHouse<>(new BigDecimal("36"));
        Assertions.assertEquals(new BigDecimal("36"), storageHouse.getMaybeFirstItem().get());
    }

    @Test
    public void shouldAcceptString() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Any text");
        Assertions.assertEquals("Any text", storageHouse.getMaybeFirstItem().get());
    }

    @Test
    public void shouldAcceptLocalDate() {
        StorageHouse<LocalDate> storageHouse = new StorageHouse<>(LocalDate.of(2023, 06, 12));
        Assertions.assertEquals(LocalDate.of(2023, 06, 12), storageHouse.getMaybeFirstItem().get());
    }

    @Test
    public void shouldAddItemsToStorageHouse() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Text 1");
        storageHouse.addMoreItems("Text 2");
        Assertions.assertEquals(2, storageHouse.items.size());
    }

    @Test
    public void shouldPrintItemFromStorageHouse() {
        StorageHouse<String> storageHouse = new StorageHouse<>("Text 1");
        storageHouse.addMoreItems("Text 2");
        ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
        storageHouse.printItems();
        Assertions.assertEquals("Text 1\r\nText 2\r\n", systemOutContent.toString());
    }
}
