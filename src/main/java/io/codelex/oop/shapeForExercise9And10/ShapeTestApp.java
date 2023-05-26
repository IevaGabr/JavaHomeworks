package io.codelex.oop.shapeForExercise9And10;

public class ShapeTestApp {
    public static void main(String[] args) {
        Triangle abc = new Triangle(2, 3, 4);
        Triangle def = new Triangle(2, 5, 9);
        if (abc.doesTriangleExist()) {
            System.out.println("Triangle ABC area: " + abc.calculateArea());
            System.out.println("Triangle ABC perimeter: " + abc.calculatePerimeter());
        } else {
            System.out.println("Triangle doesn't exists!");
        }
        if (def.doesTriangleExist()) {
            System.out.println("Triangle ABC area: " + def.calculateArea());
            System.out.println("Triangle ABC perimeter: " + def.calculatePerimeter());
        } else {
            System.out.println("Triangle doesn't exists!");
        }
        Rectangle abcd = new Rectangle(3, 5);
        System.out.println("Rectangle ABCD area: " + abcd.calculateArea());
        System.out.println("Rectangle ABCD perimeter: " + abcd.calculatePerimeter());
        Hexagon abcdef = new Hexagon(6);
        System.out.println("Hexagon ABCDEF area: " + abcdef.calculateArea());
        System.out.println("Hexagon ABCDEF perimeter: " + abcdef.calculatePerimeter());
    }
}
