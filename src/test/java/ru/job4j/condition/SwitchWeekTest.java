package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void when1ThanMonday() {
        int test = 1;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Monday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2ThanTuesday() {
        int test = 2;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Tuesday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when3ThanWednesday() {
        int test = 3;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Wednesday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when4ThanThursday() {
        int test = 4;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Thursday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5ThanFriday() {
        int test = 5;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Friday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when6ThanSaturday() {
        int test = 6;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Saturday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when7ThanSunday() {
        int test = 7;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Sunday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when8ThanError() {
        int test = 8;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Error";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenN1ThanError() {
        int test = -1;
        String result = SwitchWeek.nameOfDay(test);
        String expected = "Error";
        assertThat(result).isEqualTo(expected);
    }
}