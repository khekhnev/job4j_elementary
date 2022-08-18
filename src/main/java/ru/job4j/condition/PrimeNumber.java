package ru.job4j.condition;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 0; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
                System.out.print(i + "  ");
                System.out.println(count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        calc(11);
    }
}
