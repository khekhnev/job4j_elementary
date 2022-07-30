package ru.job4j;

import static ru.job4j.math.MathFunction.*;
public class Calculator {

    public static double subAndDiv(double first, double second) {
        return sum(sub(first, second), div(first, second));
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + sub(first, second) + multiply(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        double ex = subAndDiv(314, 235);
        System.out.println("Result of first example with 314 and 235 is " + ex);
        ex = sumAll(314, 235);
        System.out.println("result of second example with 314 and 235 is " + ex);
    }
}
