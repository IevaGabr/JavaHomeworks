package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private int fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void fillFuel(int liters) {
        for (int i = 1; i <= liters; i++) {
            if (this.fuel < 70) {
                this.fuel++;
            } else {
                break;
            }
        }
    }

    public void burnFuel() {
        if (this.fuel > 0) {
            this.fuel--;
        }
    }
}
