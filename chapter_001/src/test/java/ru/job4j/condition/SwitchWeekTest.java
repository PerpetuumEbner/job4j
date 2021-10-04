package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchWeekTest {

    @Test
    public void whenFirstDayOfTheWeekIsSelected() {
        String name = SwitchWeek.nameOfDay(1);
        assertThat(name, is("Monday"));
    }

    @Test
    public void whenSecondDayOfTheWeekIsSelected() {
        String name = SwitchWeek.nameOfDay(2);
        assertThat(name, is("Tuesday"));
    }

    @Test
    public void whenFifthDayOfTheWeekIsSelected() {
        String name = SwitchWeek.nameOfDay(5);
        assertThat(name, is("Friday"));
    }

    @Test
    public void whenWrongOfTheWeekIsSelected() {
        String name = SwitchWeek.nameOfDay(10);
        assertThat(name, is("error"));
    }
}