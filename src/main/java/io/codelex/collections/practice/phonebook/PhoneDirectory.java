package io.codelex.collections.practice.phonebook;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private final Map<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.getOrDefault(name, null);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        data.put(name, number);
    }

}
