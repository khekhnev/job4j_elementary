package ru.job4j;

public class Conventer {
    public static float rubToEuro(float value) {
        return value / 70;
    }

    public static float rubToDol(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = rubToEuro(in);
        boolean rsl = expected == out;
        System.out.println("140 rubels are 2 euro " + rsl);
        in = 180;
        expected = 3;
        out = rubToDol(in);
        rsl = expected == out;
        System.out.println("180 rubels are 3 dollars " + rsl);
    }
}
