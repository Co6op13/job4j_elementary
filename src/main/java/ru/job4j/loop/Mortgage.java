package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double credit = amount;
        while (credit > 0) {
            credit += credit / 100 * percent;
            credit -= salary;
            year++;
        }
        return year;
    }
}
