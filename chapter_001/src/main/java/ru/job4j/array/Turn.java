package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int count = array.length;
        for (int index = 0; index < array.length; index++) {
            if (index >= count) {
                break;
            }
            int temp = array[index];
            array[index] = array[count - 1];
            array[count - 1] = temp;
            count--;
        }
        return array;
    }
}