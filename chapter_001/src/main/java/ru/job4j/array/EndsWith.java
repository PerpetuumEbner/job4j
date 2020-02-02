package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int difference = word.length - post.length;

        for (int i = post.length - 1; i >= 0; i--) {
            if (post[i] != word[i + difference]) {
                result = false;
            }
        }
        return result;
    }
}
