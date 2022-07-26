package ru.job4j;

public class Conventer {
    public static float rubToEuro(float value) {
        return value / 70;
           }

    public static float rubToDol(float value) {
        return value / 60;
           }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 2;
        float out = rubToEuro(in1);
        boolean rsl1 = expected1 == out;
        System.out.println("140 rubels are 2 euro " + rsl1);
        float expected2 = 2.3333333f;
        float out2 = rubToDol(in1);
        boolean rsl2 = expected2 == out2;
        System.out.println("140 rubels are 2.33 dollars " + rsl2);
    }
}
