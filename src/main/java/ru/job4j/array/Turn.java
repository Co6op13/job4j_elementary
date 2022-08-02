package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int count = array.length;
        int halfLength = count % 2 == 0 ? count / 2 : (count - 1) / 2;
        count--;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[count - i];
            array[count - i] = temp;
        }
        return array;
    }
}
