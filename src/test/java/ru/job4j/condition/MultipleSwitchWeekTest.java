package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenEnMonThan1() {
        String test = "Monday";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(test);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenRuMonThan1() {
        String test = "Понедельник";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(test);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenEnSunThan7() {
        String test = "Sunday";
        int expected = 7;
        int result = MultipleSwitchWeek.numberOfDay(test);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenRuSunThan7() {
        String test = "Воскресенье";
        int expected = 7;
        int result = MultipleSwitchWeek.numberOfDay(test);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenEnErrThan1() {
        String test = "Err";
        int expected = -1;
        int result = MultipleSwitchWeek.numberOfDay(test);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenRuErrThan1() {
        String test = "test";
        int expected = -1;
        int result = MultipleSwitchWeek.numberOfDay(test);
        assertThat(result).isEqualTo(expected);
    }
}