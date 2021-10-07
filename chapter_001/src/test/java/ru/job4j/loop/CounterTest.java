package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenStart0Finish10() {
        assertThat(Counter.sum(0, 10), is(55));
    }

    @Test
    public void whenStart3Finish8() {
        assertThat(Counter.sum(3, 8), is(33));
    }

    @Test
    public void whenStart1Finish1() {
        assertThat(Counter.sum(1, 1), is(1));
    }
}