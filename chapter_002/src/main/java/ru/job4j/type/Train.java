package ru.job4j.type;

public class Train implements Vehicle {
    private static final String NAMECLASS = Train.class.getSimpleName();

    @Override
    public void move() {
        System.out.println(NAMECLASS + " goes.");
    }

    @Override
    public void use() {
        System.out.println(NAMECLASS + " uses electricity.");
    }
}