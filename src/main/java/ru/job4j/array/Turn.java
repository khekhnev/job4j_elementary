package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        if (array.length % 2 == 0) {
            for (int index = 0; index <= array.length / 2 - 1; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
            return array;
        } else {
            for (int index = 0; index < (array.length - 1) / 2; index++) {
                int temp = array[index];
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = temp;
            }
            return array;
        }
    }
}