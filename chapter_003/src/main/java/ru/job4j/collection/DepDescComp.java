package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rls = 0;
        int length = Math.min(left.length(), right.length());
        String[] leftArr = left.split("/");
        String[] rightArr = right.split("/");

        for (int index = 0; index < length; index++) {
            if (leftArr[0].equals(rightArr[0])) {
                rls = rightArr[0].compareTo(leftArr[0]);
            }
        }

        if (rls == 0) {
            for (int index = 1; index < length; index++) {
                rls = leftArr[index].compareTo(rightArr[index]);
            }
        }
        return rls;
    }
}