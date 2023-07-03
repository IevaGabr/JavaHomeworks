package io.codelex.oop.shapeForExercise9And10;

public class Qube extends ThreeDShape {
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * this.side;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
