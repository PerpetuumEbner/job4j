package ru.job4j.stream;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> iterator) {
        return Stream.iterate(iterator, x -> iterator.hasNext(), x -> x)
                .flatMap(it -> Stream.iterate(iterator, x -> iterator.hasNext(), x -> x))
                .map(Iterator::next)
                .collect(Collectors.toList());
    }
}