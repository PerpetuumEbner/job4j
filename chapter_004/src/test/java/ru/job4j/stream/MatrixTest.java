package ru.job4j.stream;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenConvertMatrixNumbersToListNumbers() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<List<Integer>> result = Collections.singletonList(new Matrix().convert(matrix));
        List<List<Integer>> expected = List.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertThat(expected, is(result));
    }
}