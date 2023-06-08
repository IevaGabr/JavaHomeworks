package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getQuantity());
        System.out.println(this);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return "Cat[" + getAnimalName() + ", " + breed + ", "
                + format.format(getAnimalWeight()).replace(",", ".")
                + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
