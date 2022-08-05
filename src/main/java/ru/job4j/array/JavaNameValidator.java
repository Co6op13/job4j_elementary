package ru.job4j.array;

import static java.lang.Character.*;
public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        if (name.isEmpty() || isUpperCase(name.charAt(0)) || isDigit(name.charAt(0))) {
            result = false;
        } else {
            char[] array = name.toCharArray();
            for (int i = 1; i < array.length; i++) {
                if (!(isSpecialSymbol(array[i]) || isUpperLatinLetter(array[i]) || isLowerLatinLetter(array[i]) || isDigit(array[i]))) {
                    result = false;
                    break;
                }
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