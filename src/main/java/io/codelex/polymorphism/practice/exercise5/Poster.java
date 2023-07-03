package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int length;
    private int height;

    private int numberOfCopies;

    private int rate;

    public Poster(int fee, int length, int height, int numberOfCopies, int rate) {
        super(fee);
        this.length = length;
        this.height = height;
        this.numberOfCopies = numberOfCopies;
        this.rate = rate;
    }

    public int cost() {
        return super.cost() + rate * numberOfCopies * length * height;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster:" +
                "Copies=" + numberOfCopies +
                ", rate=" + rate +
                '}';
    }
}
