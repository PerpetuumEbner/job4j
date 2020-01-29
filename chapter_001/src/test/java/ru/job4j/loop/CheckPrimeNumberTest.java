package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when51() {
        boolean rsl = CheckPrimeNumber.check(61);
        assertThat(rsl, is(true));
    }

    @Test
    public void when113() {
        boolean rsl = CheckPrimeNumber.check(113);
        assertThat(rsl, is(true));
    }

    @Test
    public void when100() {
        boolean rsl = CheckPrimeNumber.check(100);
        assertThat(rsl, is(false));
    }
}