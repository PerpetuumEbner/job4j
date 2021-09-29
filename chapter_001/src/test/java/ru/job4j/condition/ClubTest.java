package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClubTest {
    @Test
    public void whenThereIsMoney() {
        boolean allowByParent = false, hasMoney = true;

        String result = Club.permission(allowByParent, hasMoney);
        assertThat(result, is("I can go to the club."));
    }

    @Test
    public void whenIsFriend() {
        boolean allowByParent = true, hasMoney = false;

        String result = Club.permission(allowByParent, hasMoney);
        assertThat(result, is("I can go to the club."));
    }

    @Test
    public void whenAreYouTheKingOfTheParty() {
        boolean allowByParent = true, hasMoney = true;

        String result = Club.permission(allowByParent, hasMoney);
        assertThat(result, is("I can go to the club."));
    }

    @Test
    public void whenYouAreLoser() {
        boolean allowByParent = false, hasMoney = false;

        String result = Club.permission(allowByParent, hasMoney);
        assertThat(result, is("I can't."));
    }
}