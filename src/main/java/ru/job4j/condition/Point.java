package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int horizontal, int vertical) {
        this.x = horizontal;
        this.y = vertical;
    }

    public double distance(Point another) {
        return  Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow((this.y - another.y), 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(-1, -1);
        System.out.println("result (1, 1) to (-1, -1) " + point1.distance(point2));
    }
}
