package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        String string = dummy.engToRus("Unknown word.");
        System.out.println("Неизвестное слово. " + string);
    }
}