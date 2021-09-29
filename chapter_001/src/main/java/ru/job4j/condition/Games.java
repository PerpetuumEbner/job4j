package ru.job4j.condition;

public class Games {
    public static String permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            return "I can go to the cinema.";
        } else {
            return "I can't.";
        }
    }
}