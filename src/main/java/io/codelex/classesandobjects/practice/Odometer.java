package io.codelex.classesandobjects.practice;


public class Odometer {
    private int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }


    public void driveCar() {
        if (this.mileage == 999999) {
            this.mileage = 0;
        }
        this.mileage++;
    }

    public void decreaseFuel(FuelGauge fuelGauge) {
        for (int i = 1; i <= 10; i++) {
            driveCar();
        }
        fuelGauge.burnFuel();
    }


}
