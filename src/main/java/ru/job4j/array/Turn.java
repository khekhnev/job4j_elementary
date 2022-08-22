package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int delta = 0;
        if (array.length % 2 == 0) {
            for (int index = 0; index <= array.length / 2 - 1; index++) {
                int temp = array[index];
                array[index] = array[(array.length - 1) - delta];
                array[(array.length - 1) - delta] = temp;
                delta++;
            }
            return array;
        } else {
            for (int index = 0; index < (array.length - 1) / 2; index++) {
                int temp = array[index];
                array[index] = array[(array.length - 1) - delta];
                array[(array.length - 1) - delta] = temp;
                delta++;
            }
            return array;
        }
    }
}
