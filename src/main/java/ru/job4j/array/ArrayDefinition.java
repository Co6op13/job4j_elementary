package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surname равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Andrei Hincu";
        names[2] = "Stas Korobeinikov";
        names[3] = "Elena Kartashova";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();
        for (String i : names) {
            System.out.println(i);
        }
    }
}
