package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return getAnimalType() + "[" + getAnimalName() + ", "
                + format.format(getAnimalWeight()).replace(",", ".")
                + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}
