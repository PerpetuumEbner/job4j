package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Point;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        int expected = 2;
        int out = (int) Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distanceSecond() {
        int x1 = 6;
        int x2 = 4;
        int y1 = 5;
        int y2 = 3;
        int expected = 2;
        int out = (int) Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void distanceThird() {
        int x1 = 10;
        int x2 = 15;
        int y1 = 6;
        int y2 = 20;
        int expected = 14;
        int out = (int) Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out);
    }
}
