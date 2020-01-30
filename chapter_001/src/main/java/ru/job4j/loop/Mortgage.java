package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = amount;
        while (debt > 0) {
            debt = debt + percent / 100 * debt - salary;
            year++;
        }
        return year;
    }
}