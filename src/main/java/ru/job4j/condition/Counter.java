package ru.job4j.condition;

public class Counter {
    public static int sum(int start, int finish) {
        int sum;
        int sum1 = 0;
        for (sum = start; sum < finish; sum++) {
            sum1 = sum1 + (sum + 1);
        }
        return sum1;
    }

    public static int sumByEven(int start, int stop) {
        int sum = 0;
        int i = 0;
            for (i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}