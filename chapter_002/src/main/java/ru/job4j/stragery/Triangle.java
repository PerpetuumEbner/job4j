package ru.job4j.stragery;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("   +   ").append(System.lineSeparator());
        stringBuilder.append("  +++  ").append(System.lineSeparator());
        stringBuilder.append(" +++++ ").append(System.lineSeparator());
        stringBuilder.append("+++++++").append(System.lineSeparator());
        return stringBuilder.toString();
    }
}