package io.codelex.javaadvancedtest.exercise3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... item) {
        return Stream.of(item).map(Object::toString).collect(Collectors.joining(this.separator));
    }
}
