package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointEqTest {

    @Test
    public void whenEQEqual() {
        assertTrue(PointEq.eq(10, 10, 10, 10));
    }

    @Test
    public void whenEQNotEqual() {
        assertFalse(PointEq.eq(1, 1, 2, 2));
    }
}