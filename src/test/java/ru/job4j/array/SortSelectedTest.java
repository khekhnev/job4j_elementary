package ru.job4j.array;

import org.junit.jupiter.api.Test;
import ru.job4j.condition.array.SortSelected;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFive() {
        int[] data = new int[] {8, 3, 6, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 6, 7, 8};
        assertThat(result).containsExactly(expected);
    }
    @Test
    public void whenSortThree() {
        int[] data = new int[] {9, 37, 16};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {9, 16, 37};
        assertThat(result).containsExactly(expected);
    }
}