package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (isSpecialSymbol(array[i]) || isUpperLatinLetter(array[i]) || isLowerLatinLetter(array[i])) {
                System.out.println();
            } else {
                result = false;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {

        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}