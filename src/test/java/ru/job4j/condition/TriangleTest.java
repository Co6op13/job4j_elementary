package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 5;
        double ac = 20;
        double bc = 1;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    public void when123NotExist() {
        double ab = 1;
        double ac = 2.0;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    public void when321NotExist() {
        double ab = 3;
        double ac = 2;
        double bc = 1;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    public void when12dod53Exist() {
        double ab = 1;
        double ac = 2.5;
        double bc = 3.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }
}