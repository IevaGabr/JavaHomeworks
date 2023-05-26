package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarsTestApp {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        Manufacturer audi = new Manufacturer("Audi", 1909, "Germany");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "Italy");
        Manufacturer toyota = new Manufacturer("Toyota", 1937, "Japan");

        List<Manufacturer> bmwX5Manufacturers = new ArrayList<>();
        bmwX5Manufacturers.add(bmw);
        bmwX5Manufacturers.add(audi);
        bmwX5Manufacturers.add(mercedes);
        Car bmwX5 = new Car("BMW", "X5", new BigDecimal(15000), 2012, bmwX5Manufacturers, EngineType.V8);

        List<Manufacturer> mercW461Manufaturers = new ArrayList<>();
        ;
        mercW461Manufaturers.add(mercedes);
        Car mercW461 = new Car("Mercedes", "W461", new BigDecimal(25000), 1997, mercW461Manufaturers, EngineType.V12);

        List<Manufacturer> toyotaCorollaManufacturers = new ArrayList<>();
        ;
        toyotaCorollaManufacturers.add(toyota);
        toyotaCorollaManufacturers.add(fiat);
        Car toyotaCorolla = new Car("Toyota", "Corolla", new BigDecimal(9000), 2016, toyotaCorollaManufacturers, EngineType.V12);

        CarService carService = new CarService();
        carService.addCarToCarService(bmwX5);
        carService.addCarToCarService(mercW461);
        carService.addCarToCarService(toyotaCorolla);
        carService.removeCarFromCarService(toyotaCorolla);
        System.out.println(carService.getCarServiceList());
        System.out.println(carService.getCarsWithV12Engine());
        System.out.println(carService.getCarsProducedBefore1999());
        System.out.println("Most expensive car: " + carService.getMostExpensiveCar());
        System.out.println("Cheapest car: " + carService.getCheapestCar());
        System.out.println("Car with at least 3 manufacturers: " + carService.getCarWithAtLeast3Manufacturers());
        System.out.println("Sort descending: " + carService.sortListOfCar("descending"));
        if (carService.isCarInList(toyotaCorolla)) {
            System.out.println("Car is in list");
        } else {
            System.out.println("Car isn't in list");
        }
        System.out.println(carService.getCarsByManufacturer(mercedes));
        carService.addCarToCarService(toyotaCorolla);
        System.out.println("Cars after 2010: " + carService.getCarListByYear(toyota, 2010, ">"));
    }
}
