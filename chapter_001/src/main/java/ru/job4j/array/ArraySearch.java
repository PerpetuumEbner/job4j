package ru.job4j.array;

public class ArraySearch {
    public static void searchSameVariables(int[] arrayOne, int[] arrayTwo) {
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                System.out.println(arrayOne[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {3, 2, 1};
        searchSameVariables(arrayOne, arrayTwo);
    }
}
