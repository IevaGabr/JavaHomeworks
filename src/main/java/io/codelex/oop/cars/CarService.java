package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class CarService {
    private List<Car> carService = new ArrayList<>();

    public void addCarToCarService(Car car) {
        this.carService.add(car);
    }

    public void removeCarFromCarService(Car car) {
        this.carService.remove(car);
    }

    public List<Car> getCarServiceList() {
        return this.carService;
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> carsV12Engine = new ArrayList<>();
        for (Car c : this.carService) {
            if (c.getEngineType().equals(EngineType.V12)) {
                carsV12Engine.add(c);
            }
        }
        return carsV12Engine;
    }

    public List<Car> getCarsProducedBefore1999() {
        List<Car> carsBefore1999 = new ArrayList<>();
        for (Car c : this.carService) {
            if (c.getYearOfManufacturer() < 1999) {
                carsBefore1999.add(c);
            }
        }
        return carsBefore1999;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = this.carService.get(0);
        for (int i = 1; i < this.carService.size(); i++) {
            if (this.carService.get(i).getPrice().compareTo(mostExpensiveCar.getPrice()) == 1) {
                mostExpensiveCar = this.carService.get(i);
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        Car cheapestCar = this.carService.get(0);
        for (int i = 1; i < this.carService.size(); i++) {
            if (this.carService.get(i).getPrice().compareTo(cheapestCar.getPrice()) == -1) {
                cheapestCar = this.carService.get(i);
            }
        }
        return cheapestCar;
    }

    public Car getCarWithAtLeast3Manufacturers() {
        for (Car c : this.carService) {
            if (c.getManufacturer().size() >= 3) {
                return c;
            }
        }
        return null;
    }

    public List<Car> sortListOfCar(String parameter) {
        if (parameter.equalsIgnoreCase("Ascending")) {
            carService.sort(Comparator.comparing(Car::getName));
        } else {
            carService.sort(Comparator.comparing(Car::getName).reversed());
        }
        return carService;
    }

    public boolean isCarInList(Car car) {
        for (Car c : this.carService) {
            if (c.equals(car)) {
                return true;
            }
        }
        return false;
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car c : this.carService) {
            for (Manufacturer m : c.getManufacturer()) {
                if (m.equals(manufacturer)) {
                    carsByManufacturer.add(c);
                }
            }
        }
        return carsByManufacturer;
    }

    public List<Car> getCarListByYear(Manufacturer manufacturer, int year, String compOperator) {
        List<Car> carsByYear = new ArrayList<>();
        for (Car c : this.getCarsByManufacturer(manufacturer)) {
            if (compOperator.equals(">")) {
                if (c.getYearOfManufacturer() > year) {
                    carsByYear.add(c);
                }
            } else if (compOperator.equals("<")) {
                if (c.getYearOfManufacturer() < year) {
                    carsByYear.add(c);
                }
            } else if (compOperator.equals("<=")) {
                if (c.getYearOfManufacturer() <= year) {
                    carsByYear.add(c);
                }
            } else if (compOperator.equals(">=")) {
                if (c.getYearOfManufacturer() >= year) {
                    carsByYear.add(c);
                }
            } else if (compOperator.equals("=")) {
                if (c.getYearOfManufacturer() == year) {
                    carsByYear.add(c);
                }
            } else if (compOperator.equals("!=")) {
                if (c.getYearOfManufacturer() != year) {
                    carsByYear.add(c);
                }
            }
        }
        return carsByYear;
    }

}
