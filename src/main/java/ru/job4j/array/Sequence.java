package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 0;
        array[1][1] = 11;
        array[2][2] = 22;
        array[1][0] = 10;
        array[2][0] = 20;
        array[0][1] = 1;
    }
}