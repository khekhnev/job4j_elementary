package ru.job4j.condition;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int i;
        if (number == 1) {
            prime = false;
        } else {
        for (i = 1; i < number; i++) {
            i = i + 1;
            if (number % i == 0) {
                break;
            }
        }
        if (number % i == 0 && i != 0 && i != number && i != 0) {
            prime = false;
            }
        }
        return prime;
    }
}
