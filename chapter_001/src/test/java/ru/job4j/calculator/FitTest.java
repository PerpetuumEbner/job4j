package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Fit;

public class FitTest {
    @Test
    public void manWeight() {
        int in = 190;
        int expected = 103;
        int out = (int) Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        int in = 170;
        int expected = 69;
        int out = (int) Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
