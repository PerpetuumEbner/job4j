package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenFact() {
        Fact fact = new Fact();
        int expect = 720;
        int result = fact.calc(6);
        assertThat(result, is(expect));
    }
}