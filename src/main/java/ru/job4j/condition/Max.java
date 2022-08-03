package ru.job4j.condition;

public class Max {
    public static String maxfromtwo(int first, int second) {
        if (first == second) {
            String biggest = "It's over, both number are equal.";
            return biggest;
        } else {
            String biggest = first >= second ? "First bigger than second." : "Second bigger than first.";
            return biggest;
        }
    }

    public static void main(String[] args) {
        String result = Max.maxfromtwo(36, 45);
        System.out.println(result);
    }

}
