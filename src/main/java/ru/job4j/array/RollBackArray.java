package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        for (int index = 0; index < length; index++) {
            result[length - 1 - index] = array[index];
        }
        return result;
    }
}