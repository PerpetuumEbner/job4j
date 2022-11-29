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
        for (char array : arrays) {
            if (isSpecialSymbol(array)
                    || isUpperLatinLetter(array)
                    || isLowerLatinLetter(array)
                    || Character.isDigit(array)) {
                result = true;
            } else {
                result = false;
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

    public static void main(String[] args) {
        String name = "Interstellar";
        isNameValid(name);
        System.out.println(isLowerLatinLetter(49));
    }
}