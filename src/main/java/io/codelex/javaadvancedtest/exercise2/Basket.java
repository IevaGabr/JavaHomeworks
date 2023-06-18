package io.codelex.javaadvancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> items = new ArrayList<>();

    public void addToBasket(T item) throws BasketFullException {
        if (items.size() == 10) {
            throw new BasketFullException("Basket is full!");
        } else {
            items.add(item);
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (items.size() == 0) {
            throw new BasketEmptyException("Basket is empty!");
        } else {
            items.remove(item);
        }
    }

    public List<T> getItems() {
        return items;
    }
}
