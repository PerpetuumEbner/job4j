package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxTwoVariables() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxThreeVariables() {
        int result = Max.max(2, 1,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxFourVariables() {
        int result = Max.max(4, 2, 1,3);
        assertThat(result, is(4));
    }
}
