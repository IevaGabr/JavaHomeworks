package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Car car = new Car(1500);
        car.fillUp(1598, 15);
        System.out.println(car.calculateConsumption());
        car.fillUp(1749, 35);
        System.out.println(car.calculateConsumption());
        car.fillUp(2019, 60);
        System.out.println(car.calculateConsumption());
        if (car.economyCar()) {
            System.out.println("Car is an economy car");
        } else if (car.gasHog()) {
            System.out.println("Car is a gas hog");
        }


    }
}
