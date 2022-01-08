package ru.job4j.type;

public class Bus implements Vehicle {
    String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " is ride.");
    }

    @Override
    public void use() {
        System.out.println(nameClass + " uses diesel.");
    }
}