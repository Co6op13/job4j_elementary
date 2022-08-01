package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfPeriod = (a + b + c) / 2;
        return Math.sqrt(halfPeriod * (halfPeriod - a) * (halfPeriod - b) * (halfPeriod - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + rsl);
    }
}
