package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        char[] word2 = new char[word.length];
        for (int index = 0; index < word.length; index++) {
            int currentIndex = index;
            int lastIndex = word.length - index - 1;
            word2[index] = word[lastIndex];
            System.out.println(word2[index]);
            if (word2[index] != post[post.length - index - 1]) {
                result = false;
            }
        }
        return result;
    }
}
