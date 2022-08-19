package ru.job4j.condition;

public class Mortgage {
        public static int year(double amount, double salary, double percent) {
        int year = 0;
        while ((amount + amount * percent / 100)  > salary) {
            amount = (amount + amount * percent / 100) - salary;
            year++;
        }
            if (amount != 0) {
                year++;
            }
        return year;
    }

}
