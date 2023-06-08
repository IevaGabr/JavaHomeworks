package io.codelex.polymorphism.practice.exercise1;

public class Porsche implements Car, Engine {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 35;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 35;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 20;
    }

    @Override
    public String toString() {
        return "Porsche";
    }
}
