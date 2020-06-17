package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(2, 0);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        double expected = 2;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenDoesNotExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(0, 1);
        Triangle triangle = new Triangle(ap, bp, cp);
        double result = triangle.area();
        double expected = -1;
        Assert.assertEquals(expected, result, 0.01);
    }
}