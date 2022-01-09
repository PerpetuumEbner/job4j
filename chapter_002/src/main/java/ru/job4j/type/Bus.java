package ru.job4j.type;

public class Bus implements Vehicle {
    private static final String NAMECLASS = Bus.class.getSimpleName();

    @Override
    public void move() {
        System.out.println(NAMECLASS + " is ride.");
    }

    @Override
    public void use() {
        System.out.println(NAMECLASS + " uses diesel.");
    }
}