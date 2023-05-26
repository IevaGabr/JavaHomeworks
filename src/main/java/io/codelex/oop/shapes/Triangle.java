package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (this.height * this.width) / 2;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2)));
    }
}
