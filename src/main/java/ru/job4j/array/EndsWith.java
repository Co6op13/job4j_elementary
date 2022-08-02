package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int length = post.length;
        int wordLength = word.length;
        for (int i = 0; i < length; i++) {
            if (word[wordLength - 1 - i] != post[length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}