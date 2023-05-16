package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class MovieApp {
    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista International", "PG13");
        Movie spiderMan = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");

        Movie[] moviesArray = new Movie[3];
        moviesArray[0] = casinoRoyale;
        moviesArray[1] = glass;
        moviesArray[2] = spiderMan;


        System.out.println(Arrays.toString(casinoRoyale.getPG(moviesArray)));


    }


}
