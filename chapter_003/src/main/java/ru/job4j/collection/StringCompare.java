package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rls = 0;
        int length = Math.min(left.length(), right.length());
        for (int index = 0; index < length; index++) {
            rls = Character.compare(left.charAt(index), right.charAt(index));
            if (rls != 0) {
                break;
            }
        }

        if (rls == 0) {
            rls = Integer.compare(left.length(), right.length());
        }
        return rls;
    }
}