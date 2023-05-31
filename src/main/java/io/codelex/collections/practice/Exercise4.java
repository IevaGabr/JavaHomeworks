package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner input = new Scanner(System.in);
        String name;
        while (true) {
            System.out.println("Enter name: ");
            name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.println("Unique name list contains: " + names);
    }
}
