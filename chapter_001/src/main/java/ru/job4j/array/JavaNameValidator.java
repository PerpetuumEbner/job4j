package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        var arrays = name.toCharArray();
        if (name.isEmpty() || !isLowerLatinLetter(arrays[0])) {
            return false;
        }
        for (int index = 1; index < arrays.length; index++) {
            char symbol = arrays[index];
            if (!isSpecialSymbol(symbol)
                    && !isUpperLatinLetter(symbol)
                    && !isLowerLatinLetter(symbol)
                    && !Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}