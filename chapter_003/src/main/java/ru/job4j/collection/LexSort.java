package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftArr = left.split(". ");
        String[] rightArr = right.split(". ");

        int leftValue = Integer.parseInt(leftArr[0]);
        int rightValue = Integer.parseInt(rightArr[0]);

        return Integer.compare(leftValue, rightValue);
    }
}