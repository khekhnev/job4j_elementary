package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double sum1 = (a + b + c) / 2;
        return Math.sqrt(sum1 * (sum1 - a) * (sum1 - b) * (sum1 - c));
            }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2,2,2) = " + rsl);
    }
}
