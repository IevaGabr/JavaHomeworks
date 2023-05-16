package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPG(Movie[] movies) {
        Movie[] moviesPG = new Movie[movies.length];
        int j = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                moviesPG[j] = movies[i];
                j++;
            }
        }
        return moviesPG;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
