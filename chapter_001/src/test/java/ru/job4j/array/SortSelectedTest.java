package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortFiveElements() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThreeElements() {
        int[] input = new int[]{3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFourElements() {
        int[] input = new int[]{3, 4, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}