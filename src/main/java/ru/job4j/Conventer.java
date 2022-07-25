package ru.job4j;

public class Conventer {
    public static float rubToEuro(float value) {
        float res = value / 70;
        return res;
    }

    public static float rubToDol(float value) {
        float res = value / 60;
        return res;
    }

    public static void main(String[] args) {
        float euro = rubToEuro(140);
        System.out.println("140 rubels are " + euro + " euro");
        float dollars = rubToDol(140);
        System.out.println("140 rubels are " + dollars + " dollars");
    }
}
