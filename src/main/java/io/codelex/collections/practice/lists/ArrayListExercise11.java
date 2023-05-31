package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> list = new ArrayList<>();

        //TODO: Add 10 values to list
        list.add("Cat");
        list.add("Dog");
        list.add("Fox");
        list.add("Rabbit");
        list.add("Lion");
        list.add("Bear");
        list.add("Horse");
        list.add("Giraffe");
        list.add("Cow");
        list.add("Zebra");

        //TODO: Add new value at 5th position

        list.add(4, "Pig");

        //TODO: Change value at last position (Calculate last position programmatically)
        list.set(list.size() - 1, "Camel");

        //TODO: Sort your list in alphabetical order
        Collections.sort(list);

        //TODO: Check if your list contains "Foobar" element
        if (list.contains("Foobar")) {
            System.out.println("Contains");
        } else {
            System.out.println("No such element");
        }

        //TODO: Print each element of list using loop
        for (String e : list) {
            System.out.println(e);
        }
    }

}
