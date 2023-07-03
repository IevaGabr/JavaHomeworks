package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Felime {

    private String livingRegion;

    @Override
    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Tiger are not eating that type of food!");
            setFoodEaten(0);
        } else {
            setFoodEaten(food.getQuantity());
            System.out.println(this);
        }
    }

/*    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return "Tiger[" + getAnimalName() + ", " + format.format(getAnimalWeight()).replace(",", ".") + ", " + livingRegion + ", " + getFoodEaten() + "]";
    }*/
}
