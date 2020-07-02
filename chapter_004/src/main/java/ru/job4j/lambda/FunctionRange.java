package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionRange {
    public static List<Double> diapason(int start, int end, Function<Double, Double> function) {
        ArrayList<Double> result = new ArrayList<>();
        for (double index = start; index < end; index++) {
            result.add(function.apply(index));
        }
        return result;
    }
}