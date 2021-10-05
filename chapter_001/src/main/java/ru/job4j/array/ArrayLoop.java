package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] count = new int[5];

        for (int index = 0; index < count.length; index++) {
            count[index] = index * 2 + 3;
        }

        for (int cell : count) {
            System.out.println(cell);
        }
    }
}