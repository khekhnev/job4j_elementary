package ru.job4j.condition.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
