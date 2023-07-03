package io.codelex.oop.shapeForExercise9And10;

public class Cone extends ThreeDShape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * (radius + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2)));
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height / 3;
    }
}
