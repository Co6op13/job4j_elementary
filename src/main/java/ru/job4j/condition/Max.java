package ru.job4j.condition;
public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return temp > third ? temp : third;
    }
}
