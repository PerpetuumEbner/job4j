package ru.job4j.condition;

public class PointEq {

    public static boolean eq(int x1, int y1, int x2, int y2) {
        boolean eqX = x1 == x2;
        boolean eqY = y1 == y2;
        return eqX && eqY;
    }
}