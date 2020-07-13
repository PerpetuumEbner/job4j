package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionRangeTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionRange.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = List.of(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FunctionRange.diapason(2, 7, x -> Math.pow(x, 2) - x - 2);
        List<Double> expected = List.of(0D, 4D, 10D, 18D, 28D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FunctionRange.diapason(1, 5, x -> Math.pow(2, x));
        List<Double> expected = List.of(2D, 4D, 8D, 16D);
        assertThat(result, is(expected));
    }
}