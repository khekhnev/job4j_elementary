package ru.job4j.array;

import org.junit.jupiter.api.Test;
import ru.job4j.condition.array.Turn;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithNoEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[] {7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}