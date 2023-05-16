package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        //fixme
        double energyDrinkers = calculateEnergyDrinkers(EnergyDrinks.NUMBERED_SURVEYED);
        System.out.println("Total number of people surveyed " + EnergyDrinks.NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        double preferCitrus = calculatePreferCitrus(EnergyDrinks.NUMBERED_SURVEYED);
        System.out.println(preferCitrus + " of those " + energyDrinkers + " prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * EnergyDrinks.PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return calculateEnergyDrinkers(numberSurveyed) * EnergyDrinks.PREFER_CITRUS_DRINKS;
    }
}
