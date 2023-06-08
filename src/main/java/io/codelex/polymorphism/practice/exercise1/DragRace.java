package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Lexus lexusRX = new Lexus();
        Porsche porsche911 = new Porsche();
        Mercedes mercedesG = new Mercedes();
        Tesla teslaX = new Tesla();
        Audi audiQ5 = new Audi();
        Bmw bmwX5 = new Bmw();
        List<Car> carList = new ArrayList<>();
        carList.add(lexusRX);
        carList.add(porsche911);
        carList.add(mercedesG);
        carList.add(teslaX);
        carList.add(audiQ5);
        carList.add(bmwX5);
        for (int i = 0; i < 10; i++) {
            for (Car car : carList) {
                if (i == 3) {
                    if (car instanceof Engine) {
                        ((Engine) car).useNitrousOxideEngine();
                    } else {
                        car.speedUp();
                    }
                } else {
                    car.speedUp();
                }
            }
        }
        Car fastestCar = carList.get(0);
        int fastestCarSpeed = Integer.parseInt(carList.get(0).showCurrentSpeed());
        for (int i = 1; i < carList.size(); i++) {
            if (Integer.parseInt(carList.get(i).showCurrentSpeed()) > fastestCarSpeed) {
                fastestCar = carList.get(i);
                fastestCarSpeed = Integer.parseInt(carList.get(i).showCurrentSpeed());
            }
        }
        System.out.println("Fastest car is " + fastestCar + " with speed " + fastestCarSpeed);
    }
}
