package io.codelex.oop.shapeForExercise9And10;

public class Hexagon extends Shape {
    private double regularHexagonSide;

    public Hexagon(double regularHexagonSide) {
        this.regularHexagonSide = regularHexagonSide;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * this.regularHexagonSide;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(regularHexagonSide, 2)) / 2;
    }
}
