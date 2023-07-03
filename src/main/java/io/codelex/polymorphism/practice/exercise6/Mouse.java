package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("Squeak squeak");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Mouse are not eating that type of food!");
            setFoodEaten(0);
        } else {
            setFoodEaten(food.getQuantity());
            System.out.println(this);
        }
    }

}
