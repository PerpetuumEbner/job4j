package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {
    @Test
    public void whenIsEven() {
        assertTrue(LogicNot.isEven(4));
    }

    @Test
    public void whenIsPositive() {
        assertTrue(LogicNot.isPositive(1));
    }

    @Test
    public void whenNotEven() {
        assertTrue(LogicNot.notEven(5));
    }

    @Test
    public void whenNotPositive() {
        assertTrue(LogicNot.notPositive(-1));
    }

    @Test
    public void whenNotEvenAndPositive() {
        assertTrue(LogicNot.notEvenAndPositive(3));
    }

    @Test
    public void whenEvenOrNotPositive() {
        assertTrue(LogicNot.evenOrNotPositive(-2));
    }
}