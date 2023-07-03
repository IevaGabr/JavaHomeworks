package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise6App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lineRead = input.nextLine();
        Mammal animal = new Mouse();
        Food food = new Meat();
        List<Mammal> animalList = new ArrayList<>();
        int i = 1;
        while (!lineRead.equalsIgnoreCase("end")) {
            if (i % 2 == 1) {
                String[] infoAboutAnimal = lineRead.split(" ");
                switch (infoAboutAnimal[0].toLowerCase()) {
                    case "cat" -> animal = new Cat();
                    case "tiger" -> animal = new Tiger();
                    case "mouse" -> animal = new Mouse();
                    case "zebra" -> animal = new Zebra();
                }
                animal.setAnimalType(infoAboutAnimal[0]);
                animal.setAnimalName(infoAboutAnimal[1]);
                animal.setAnimalWeight(Double.parseDouble(infoAboutAnimal[2]));
                animal.setLivingRegion(infoAboutAnimal[3]);
                if (animal instanceof Cat) {
                    ((Cat) animal).setBreed(infoAboutAnimal[4]);
                }
                animal.makeSound();
            } else {
                String[] infoAboutFood = lineRead.split(" ");
                switch (infoAboutFood[0].toLowerCase()) {
                    case "meat" -> food = new Meat();
                    case "vegetable" -> food = new Vegetable();
                }
                food.setQuantity(Integer.parseInt(infoAboutFood[1]));
                animal.eat(food);
                animalList.add(animal);
            }
            i++;
            lineRead = input.nextLine();
        }
        System.out.println(animalList.stream().map(Mammal::toString).collect(Collectors.joining(", ")));
    }
}
