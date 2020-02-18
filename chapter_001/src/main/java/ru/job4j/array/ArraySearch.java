package ru.job4j.array;

public class ArraySearch {
    public static void searchSameVariables(int[] arrayOne, int[] arrayTwo) {
        for (int index = 0; index < arrayOne.length; index++) {
            if (arrayOne[index] == arrayTwo[index]) {
                System.out.println(arrayOne[index]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {3, 2, 1};
        searchSameVariables(arrayOne, arrayTwo);
    }
}
