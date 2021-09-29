package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GamesTest {
    @Test
    public void whenAllConditionsAreMet() {
        boolean allowByParent = true, hasMoney = true;

        String result = Games.permission(allowByParent, hasMoney);
        assertThat(result, is("I can go to the cinema."));
    }

    @Test
    public void whenThereIsNoParentalPermission() {
        boolean allowByParent = false, hasMoney = true;

        String result = Games.permission(allowByParent, hasMoney);
        assertThat(result, is("I can't."));
    }

    @Test
    public void whenThereIsNoMoney() {
        boolean allowByParent = true, hasMoney = false;

        String result = Games.permission(allowByParent, hasMoney);
        assertThat(result, is("I can't."));
    }

    @Test
    public void whenEverythingIsBad() {
        boolean allowByParent = false, hasMoney = false;

        String result = Games.permission(allowByParent, hasMoney);
        assertThat(result, is("I can't."));
    }
}