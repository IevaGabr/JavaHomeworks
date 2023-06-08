package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("Click click");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Zebra are not eating that type of food!");
            setFoodEaten(0);
        } else {
            setFoodEaten(food.getQuantity());
            System.out.println(this);
        }
    }

}
