package ru.job4j.stragery;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("++++").append(System.lineSeparator());
        stringBuilder.append("+  +").append(System.lineSeparator());
        stringBuilder.append("+  +").append(System.lineSeparator());
        stringBuilder.append("++++").append(System.lineSeparator());
        return stringBuilder.toString();
    }
}