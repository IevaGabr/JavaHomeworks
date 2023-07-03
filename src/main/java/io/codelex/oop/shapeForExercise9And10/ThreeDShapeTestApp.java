package io.codelex.oop.shapeForExercise9And10;

public class ThreeDShapeTestApp {
    public static void main(String[] args) {
        Cone cone = new Cone(3, 4);
        System.out.println("Cone perimeter: " + cone.calculatePerimeter());
        System.out.println("Cone area: " + cone.calculateArea());
        System.out.println("Cone volume: " + cone.calculateVolume());
        Qube qube = new Qube(5);
        System.out.println("Qube perimeter: " + qube.calculatePerimeter());
        System.out.println("Qube area: " + qube.calculateArea());
        System.out.println("Qube volume: " + qube.calculateVolume());
    }
}
