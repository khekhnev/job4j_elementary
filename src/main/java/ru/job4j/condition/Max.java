package ru.job4j.condition;

public class Max {
    public static int maxfromtwo(int first, int second) {
        if (first == second) {
            return first;
        } else {
            int number = first >= second ? first : second;
            return number;
        }
    }

    public static void main(String[] args) {
        int result = Max.maxfromtwo(36, 45);
        System.out.println(result);
    }

}
