package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int test = 0;
        for (int index = 0; index < array.length; index++) {
            test++;
            if (array[index] == null) {
                for (int j = index; j < array.length; j++) {
                    if (array[j] != null) {
                        test++;
                        array[index] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
        System.out.println(test);
        return array;
    }

    public static String[] compressTest(String[] array) {
        int offset = 0;
        int test = 0;
        for (int index = 0; index < array.length - offset; index++) {
            test++;
            if (array[index] == null) {
                for (int j = index; j < array.length - offset; j++) {
                    if (array[j] != null) {
                        test++;
                        array[index] = array[j];
                        array[j] = array[array.length - offset - 1];
                        array[array.length - offset - 1] = null;
                        break;
                    }
                }
            }
        }
        System.out.println(test);
        return array;
    }
}
