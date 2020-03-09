package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Список пассажиров");
    }

    @Override
    public int refuel(int price) {
        return price;
    }
}