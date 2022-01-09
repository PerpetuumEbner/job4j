package ru.job4j.type;

public class Plane implements Vehicle {
    private static final String NAMECLASS = Plane.class.getSimpleName();

    @Override
    public void move() {
        System.out.println(NAMECLASS + " is flying.");
    }

    @Override
    public void use() {
        System.out.println(NAMECLASS + " uses aviation fuel");
    }
}