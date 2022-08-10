package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    public void monday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void wednesday() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void thursday() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void friday() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void saturday() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void sunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресенье";
        assertThat(result).isEqualTo(expected);
    }
}