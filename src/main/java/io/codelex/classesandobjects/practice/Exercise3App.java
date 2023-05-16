package io.codelex.classesandobjects.practice;

public class Exercise3App {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge(0);
        Odometer odometer = new Odometer(16520);
        fuelGauge.fillFuel(25);
        while (fuelGauge.getFuel() > 0) {
            odometer.decreaseFuel(fuelGauge);
            System.out.println("Car's current mileage: " + odometer.getMileage()
                    + " amount of fuel: " + fuelGauge.getFuel());
        }
    }
}
