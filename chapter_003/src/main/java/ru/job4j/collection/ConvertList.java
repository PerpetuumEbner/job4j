package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            int index = 0;
            while (index < row.length) {
                rsl.add(row[index]);
                index++;
            }
        }
        return rsl;
    }
}