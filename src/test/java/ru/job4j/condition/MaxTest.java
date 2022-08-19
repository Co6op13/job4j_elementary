package ru.job4j.condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax4To4To1Then4() {
        int first = 4;
        int second = 4;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2To1Then3() {
        int first = 3;
        int second = 2;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To4To1Then4() {
        int first = 3;
        int second = 4;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxN1ToN2ThenN1() {
        int left = -1;
        int right = -2;
        int result = Max.max(left, right);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1ToN2Then1() {
        int left = 1;
        int right = -2;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}