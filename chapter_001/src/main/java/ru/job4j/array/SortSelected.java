package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int value = FindLoop.indexOf(data, min, index, data.length);
            if (min < data[index]) {
                int temp = data[index];
                data[index] = data[value];
                data[value] = temp;
            }
        }
        return data;
    }
}