package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int out = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(out).isEqualTo(expected);
    }


    @Test
    void whenSumEvenNumbersFrom7To13Then30() {
        int out = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(out).isEqualTo(expected);
    }
}