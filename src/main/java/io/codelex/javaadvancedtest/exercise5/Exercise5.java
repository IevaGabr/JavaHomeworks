package io.codelex.javaadvancedtest.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent);
    }

    public static <T> double partOf(List<T> list, Function<T, Boolean> function) {
        List<T> secondList = new ArrayList<>();
        for (T l : list) {
            if (function.apply(l)) {
                secondList.add(l);
            }
        }
        return (double) secondList.size() / list.size();
    }
}
