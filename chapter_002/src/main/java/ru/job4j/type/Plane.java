package ru.job4j.type;

public class Plane implements Vehicle {
    String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " is flying.");
    }

    @Override
    public void use() {
        System.out.println(nameClass + " uses aviation fuel");
    }
}