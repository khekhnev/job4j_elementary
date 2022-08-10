package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    public void day1dot1() {
        String day1 = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day1);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void day1dot2() {
        String day1 = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day1);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

}