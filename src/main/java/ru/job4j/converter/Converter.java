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

        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2.3333333f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expectedEuro == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        out = Converter.rubleToDollar(in);
        passed = expectedDollar == out;
        System.out.println("140 rubles are 2.3333333 Test result : " + passed);
    }
}