package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void whetNameGameSuperMarioEquals() {
        String game = "Super Mario";
        Game.setGames("Super Mario");
        String result = "Start - " + game;
        assertThat(new Game().menu(game), is(result));
    }

    @Test
    public void whetNameGameTanksEquals() {
        String game = "Tanks";
        Game.setGames("Tanks");
        String result = "Start - " + game;
        assertThat(new Game().menu(game), is(result));
    }

    @Test
    public void whetNameGameTetrisEquals() {
        String game = "Tetris";
        Game.setGames("Tetris");
        String result = "Start - " + game;
        assertThat(new Game().menu(game), is(result));
    }

    @Test
    public void whetNameGameDoNotMatch() {
        String game = "Tank";
        Game.setGames("Tanks");
        String result = "Start - " + game;
        assertThat(new Game().menu(game), is("Ошибка при вводе названия игры"));
    }
}