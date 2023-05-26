package io.codelex.oop.shapeForExercise9And10;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean doesTriangleExist() {
        return sideC < sideB + sideA && sideB < sideA + sideC && sideA < sideC + sideB;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return semiPerimeter * Math.sqrt((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
}
