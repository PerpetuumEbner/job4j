package ru.job4j.checkstyle;

public class Broken {
    private final String newValue = "";
    private final int sizeOfEmpty = 10;
    private String surname;
    private String name;

    public Broken(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public void echo() {
        System.out.printf(newValue + sizeOfEmpty);
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int[] arrayIndex) {
        System.out.println(arrayIndex.length);
    }
}