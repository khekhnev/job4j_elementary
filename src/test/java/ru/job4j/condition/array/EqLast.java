package ru.job4j.condition.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
         return left[left.length - 1] == right[right.length - 1];
    }

}
