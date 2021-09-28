package ru.job4j.condition;

public class Game {
    private static String games;

    public static String setGames(String games) {
        Game.games = games;
        return games;
    }

    public String menu(String name) {
        if (name.equals(games)) {
            return "Start - " + games;
        } else {
            return "Ошибка при вводе названия игры";
        }
    }
}