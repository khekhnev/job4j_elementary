package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (1 + k));
        double l = k * h;
        double s = h * l;
        return s;
    }

    public static void main(String[] args) {
        double rsl = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + rsl);
    }
}
