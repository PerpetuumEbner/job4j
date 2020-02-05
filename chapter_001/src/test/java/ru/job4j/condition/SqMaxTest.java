package ru.job4j.condition;

import org.hamcrest.core.Is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void max1() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, Is.is(4));
    }

    @Test
    public void max2() {
        int result = SqMax.max(4, 2, 3, 1);
        assertThat(result, Is.is(4));
    }

    @Test
    public void max3() {
        int result = SqMax.max(1, 4, 3, 2);
        assertThat(result, Is.is(4));
    }

    @Test
    public void max4() {
        int result = SqMax.max(1, 2, 4, 3);
        assertThat(result, Is.is(4));
    }

    @Test
    public void max5() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, Is.is(7));
    }
}
