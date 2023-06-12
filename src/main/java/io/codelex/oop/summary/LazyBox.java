package io.codelex.oop.summary;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class LazyBox<T> {
    private Supplier<T> function;
    private static int calls = 0;
    private T value;

    public LazyBox(Supplier<T> function) {
        this.function = function;
    }

    public T get() {
        calls++;
        if (calls % 2 == 1) {
            value = function.get();
            return null;
        } else {
            return value;
        }
    }
}
