package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(2.0));
    }

    @Test
    public void distanceSecond() {
        Point a = new Point(1, 1);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(1.4142135623730951));
    }

    @Test
    public void distanceThird() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 3);
        double dist = a.distance(b);
        assertThat(dist, is(3.1622776601683795));
    }
}