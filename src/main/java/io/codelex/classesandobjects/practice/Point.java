package io.codelex.classesandobjects.practice;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void swapPoints(Point point1, Point point2) {
        int saveX = point1.x;
        int saveY = point1.y;
        point1.x = point2.x;
        point1.y = point2.y;
        point2.x = saveX;
        point2.y = saveY;
    }
}
