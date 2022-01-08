package ru.job4j.type;

public class Train implements Vehicle {
    String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " goes.");
    }

    @Override
    public void use() {
        System.out.println(nameClass + " uses electricity.");
    }
}