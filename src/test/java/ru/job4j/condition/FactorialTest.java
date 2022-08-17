package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    public void ifnIs5ThenResultIs120() {
        int in = 5;
        int out = Factorial.calc(in);
        int expected = 120;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void ifnIs0ThenResultIs1() {
        int in = 0;
        int out = Factorial.calc(in);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void ifnIs6ThenResultIs720() {
        int in = 6;
        int out = Factorial.calc(in);
        int expected = 720;
        assertThat(out).isEqualTo(expected);
    }
}