package ru.job4j.oop;

public class Student extends Object {
    public void music() {
        for (int index = 0; index < 3; index++) {
            System.out.println("Tra tra tra");
        }
    }

    public void song() {
        for (int index = 0; index < 3; index++) {
            System.out.println("I believe I can fly");
        }
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.song();
    }
}