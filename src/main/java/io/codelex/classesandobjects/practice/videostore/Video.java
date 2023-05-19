package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean availability;

    int ratingSum;
    int ratingCount;

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
        return ratingSum;
    }

    public void setRating(int rating) {
        this.ratingSum += rating;
        this.ratingCount++;
    }

    public double getAverageRating() {
        return (double) this.ratingSum / this.ratingCount;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\t availability: " + availability + "\t rating: " + String.format("%.2f", getAverageRating()) + "\n";
    }
}
