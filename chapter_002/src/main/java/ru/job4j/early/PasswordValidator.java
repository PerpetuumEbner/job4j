package ru.job4j.early;

import java.util.List;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Пароль не должен быть пустым.");
        }

        List<String> list = List.of("qwerty", "12345", "password", "admin", "user");
        String passwordLowerCas = password.toLowerCase();
        if (list.contains(passwordLowerCas)) {
            return "Пароль не должен быть простым.";
        }

        char[] symbols = password.toCharArray();
        if (password.length() <= 8 || password.length() >= 32) {
            return "Пароль должен быть от 8 до 32 символов включительно.";
        }

        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean isLetterOrDigit = false;

        for (Character symbol : symbols) {
            if (Character.isUpperCase(symbol)) {
                isUpperCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                isLowerCase = true;
            }
            if (Character.isDigit(symbol)) {
                isDigit = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                isLetterOrDigit = true;
            }
        }

        if (!isUpperCase) {
            return "Пароль должен содержать символы верхнего регистра.";
        }
        if (!isLowerCase) {
            return "Пароль должен содержать символы нижнего регистра.";
        }
        if (!isDigit) {
            return "Пароль должен содержать цифры.";
        }
        if (!isLetterOrDigit) {
            return "Пароль должен содержать спецсимволы.";
        }
        return "Пароль соответствует требованиям.";
    }
}