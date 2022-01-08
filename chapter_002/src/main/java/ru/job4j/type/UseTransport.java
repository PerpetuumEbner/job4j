package ru.job4j.type;

public class UseTransport {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicle = new Vehicle[]{plane, train, bus};

        for (Vehicle vehicles : vehicle) {
            vehicles.use();
            vehicles.move();
        }
    }
}