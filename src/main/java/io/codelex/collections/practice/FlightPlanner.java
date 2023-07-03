package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.System.exit;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flights = Files.readAllLines(path, charset);
        Set<String> cities = new HashSet<>();
        for (String flight : flights) {
            String[] array = flight.split(" -> ");
            for (String a : array) {
                cities.add(a);
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do:\nTo display list of cities press 1\nTo exit program press #");
        String userChoice = input.nextLine();
        if (userChoice.equals("#")) {
            exit(0);
        }
        System.out.println(cities);
        System.out.println("To select a city from which you would like start press 1\nTo exit program press #");
        userChoice = input.nextLine();
        if (userChoice.equals("#")) {
            exit(0);
        }
        System.out.println("Enter a city: ");
        String userCity = input.nextLine();
        List<String> journey = new ArrayList<>();
        journey.add(userCity);
        System.out.println("To continue journey press 1\nTo exit program press #");
        userChoice = input.nextLine();
        while (!userChoice.equals("#")) {
            List<String> destination = getDestinationCities(flights, userCity);
            System.out.println("Select next destination city: " + destination);
            userCity = input.nextLine();
            while (!destination.contains(userCity)) {
                System.out.println("No such flight. Please choose city from list: " + destination);
                userCity = input.nextLine();
            }
            journey.add(userCity);
            if (userCity.equals(journey.get(0))) {
                System.out.println("You are back at start point. Your journey: ");
                for (int i = 0; i < journey.size() - 1; i++) {
                    System.out.print(journey.get(i) + " -> ");
                }
                System.out.print(journey.get(journey.size() - 1));
                break;
            }
            System.out.println("To continue journey press 1\nTo exit program press #");
            userChoice = input.nextLine();
        }
    }

    public static List<String> getDestinationCities(List<String> flights, String userCity) {
        List<String> destination = new ArrayList<>();
        for (String flight : flights) {
            String[] array = flight.split(" -> ");
            if (array[0].equalsIgnoreCase(userCity)) {
                destination.add(array[1]);
            }
        }
        return destination;
    }

}
