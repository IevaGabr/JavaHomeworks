package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results

        List<String> arrayList = Arrays.asList(array);

        //todo - replace array with a HashSet and print out the results

        Set<String> arrayToSet = new HashSet<>(Arrays.asList(array));

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> arrayToMap = new HashMap<>();
        String[] origination = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};
        for (int i = 0; i < array.length; i++) {
            arrayToMap.put(array[i], origination[i]);
        }
    }
}
