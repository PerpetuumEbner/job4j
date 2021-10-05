package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenFirstDayOfTheWeekIsSelectedInRussian() {
        assertThat(MultipleSwitchWeek.numberOfDay("Понедельник"), is(1));
    }

    @Test
    public void whenFifthDayOfTheWeekIsSelectedInEnglish() {
        assertThat(MultipleSwitchWeek.numberOfDay("Friday"), is(5));
    }

    @Test
    public void whenErrorEnteringDayOfTheWeek() {
        assertThat(MultipleSwitchWeek.numberOfDay("Dimanche"), is(-1));
    }
}