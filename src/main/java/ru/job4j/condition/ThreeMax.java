package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first  && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }

    public static int maxTest(int first, int second, int third) {
        return maxOf2numbers(maxOf2numbers(first, second), third);
    }
    
    private static int maxOf2numbers(int x, int y) {
        return (x + y + Math.abs(x - y)) / 2;
    }
}