package ru.job4j.condition;

public class Factorial {
    public  static int calc(int n) {
        if (n != 0) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        } else {
            int result = 1;
            return result;
            }
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}
