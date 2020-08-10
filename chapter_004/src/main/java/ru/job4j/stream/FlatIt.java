package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> iterator) {
        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.stream().flatMap(it -> it.getClass()).collect(Collectors.toList());
        }
        return list;
    }
}