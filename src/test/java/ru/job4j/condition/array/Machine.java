package ru.job4j.condition.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[0];
        int minus = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (minus >= coins[i]) {
                minus = minus - coins[i];
                rsl = Arrays.copyOf(rsl, rsl.length + 1);
                rsl[rsl.length - 1] = coins[i];
            }
        }
        return rsl;
    }
}
