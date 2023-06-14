package io.codelex.javaadvancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> items = new ArrayList<>();
    private int count = 0;

    public void addToBasket(T item) throws BasketFullException {
        if (count == 10) {
            throw new BasketFullException("Basket is full!");
        } else {
            items.add(item);
            count++;
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (count == 0) {
            throw new BasketEmptyException("Basket is empty!");
        } else {
            items.remove(item);
            count--;
        }
    }

    public List<T> getItems() {
        return items;
    }
}
