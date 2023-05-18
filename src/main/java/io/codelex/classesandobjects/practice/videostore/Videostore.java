package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class Videostore {

    List<Video> videostore = new ArrayList<>();


    public void addVideo(String title) {
        Video newMovie = new Video();
        newMovie.setTitle(title);
        newMovie.setAvailability(true);
        videostore.add(newMovie);
    }

    public String checkoutVideo(String title) {
        for (int i = 0; i < videostore.size(); i++) {
            if (videostore.get(i).getTitle().equals(title) && videostore.get(i).isAvailability()) {
                videostore.get(i).setAvailability(false);
                return "Video is rent!";

            }
        }
        return "Video isn't available";
    }

    public void returnVideo(String title) {
        for (int i = 0; i < videostore.size(); i++) {
            if (videostore.get(i).getTitle().equals(title)) {
                videostore.get(i).setAvailability(true);
                break;
            }
        }
    }

    public void takeRating(String title, double rating) {
        for (int i = 0; i < videostore.size(); i++) {
            if (videostore.get(i).getTitle().equals(title)) {
                if (videostore.get(i).getRating() != 0) {
                    videostore.get(i).setRating((videostore.get(i).getRating() + rating) / 2);
                    break;
                } else {
                    videostore.get(i).setRating(rating);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Videostore{" +
                "videostore=" + videostore +
                '}';
    }
}
