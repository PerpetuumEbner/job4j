package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 50; index++) {
            int number = (int) ((Math.random() * (200 + 1)) - 100);
            list.add(number);
        }
        list.stream().filter(x -> x > 0).collect(Collectors.toList()).forEach(System.out::println);
    }
}