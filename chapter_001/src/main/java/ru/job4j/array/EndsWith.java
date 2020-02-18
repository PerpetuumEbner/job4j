package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int difference = word.length - post.length;

        for (int index = post.length - 1; index >= 0; index--) {
            if (post[index] != word[index + difference]) {
                result = false;
            }
        }
        return result;
    }
}
