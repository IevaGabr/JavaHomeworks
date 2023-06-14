package io.codelex.javaadvancedtest;

import io.codelex.javaadvancedtest.exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2Test {
    @Test
    public void shouldMadeBasketOfAppleAndAddItems() throws BasketFullException {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        Assertions.assertNotNull(appleBasket.getItems().get(0));
    }

    @Test
    public void shouldMadeBasketOfMushroomsAndAddItems() throws BasketFullException {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        Assertions.assertNotNull(mushroomBasket.getItems().get(0));
    }

    @Test
    public void shouldThrowBasketEmptyExceptionIfRemoveItemFromEmptyBasket() throws BasketEmptyException {
        Basket<Apple> basket = new Basket<>();
        Apple apple = new Apple();
        Assertions.assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket(apple));
    }

    @Test
    public void shouldThrowBasketFullExceptionIfAddMoreThan10Items() throws BasketFullException {
        Basket<Mushroom> basket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        for (int i = 0; i < 10; i++) {
            basket.addToBasket(mushroom);
        }
        Assertions.assertThrows(BasketFullException.class, () -> basket.addToBasket(mushroom));
    }
}
