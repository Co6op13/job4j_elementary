package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70f;
    }

    public static float rubleToDollar(float value) {
        return value / 60f;
    }

    public static void main(String[] args) {
        float rub = 140;
        float euro = Converter.rubleToEuro(rub);
        float dollar = Converter.rubleToDollar(rub);
        System.out.println(rub + " rubles are " + euro + " euro.");
        System.out.println(rub + " rubles are " + dollar + " dollar.");
    }
}