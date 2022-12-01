package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        var arrays = name.toCharArray();
        if (arrays.length == 0
                || isUpperLatinLetter(arrays[0])
                || Character.isDigit(arrays[0])) {
            return false;
        }
        for (int index = 1; index < arrays.length; index++) {
            result = false;
            char array = arrays[index];
            if (isSpecialSymbol(array)
                    || isUpperLatinLetter(array)
                    || isLowerLatinLetter(array)
                    || Character.isDigit(array)) {
                result = true;
            }
            if (!result) {
                break;
            }
        }
        return result;
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