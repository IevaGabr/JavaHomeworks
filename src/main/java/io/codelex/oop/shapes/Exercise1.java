package io.codelex.oop.shapes;

public class Exercise1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3, 5);
        Triangle triangle = new Triangle(3, 2, 3);
        System.out.println("Rectangle area is " + String.format("%.2f", rectangle.getArea()));
        System.out.println("Rectangle perimeter is " + String.format("%.2f", rectangle.getPerimeter()));
        System.out.println("Triangle are is " + String.format("%.2f", triangle.getArea()));
        System.out.println("Triangle perimeter is " + String.format("%.2f", triangle.getPerimeter()));
    }
}
