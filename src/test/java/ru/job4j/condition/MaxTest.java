package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax35To24T35() {
        int first = 35;
        int second = 24;
        String rsl = Max.maxfromtwo(first, second);
        String expected = "First bigger than second.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax24To35T35() {
        int first = 24;
        int second = 35;
        String rsl = Max.maxfromtwo(first, second);
        String expected = "Second bigger than first.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax35To35T35() {
        int first = 35;
        int second = 35;
        String rsl = Max.maxfromtwo(first, second);
        String expected = "It's over, both number are equal.";
        assertThat(rsl).isEqualTo(expected);
    }
}
