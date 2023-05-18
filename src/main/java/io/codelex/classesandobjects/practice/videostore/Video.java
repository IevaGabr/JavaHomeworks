package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean availability;

    private double rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\t availability: " + availability + "\t rating: " + rating + "\n";
    }
}
