package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas1Then6() {
        int[] data = new int[] {5, 10, 3, 24, 31, 55, 1};
        int el = 1;
        int result = FindLoop.indexOf(data, el);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas2ThenN1() {
        int[] data = new int[] {5, 10, 3};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas18Then8() {
        int[] data = new int[] {5, 2, 10, 2, 4, 10, 11, 12, 18, 20};
        int el = 18;
        int start = 6;
        int finish = 9;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenN1() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 8;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}