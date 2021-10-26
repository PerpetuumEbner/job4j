package ru.job4j.stream.builder;

/**
 * Класс содержит в себе характеристики конкретного автомобиля.
 *
 * @author yustas
 * @version 1.0
 */
public class CarBuilder {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .buildBrand("AUDI")
                .buildModel("S7 Sportback")
                .buildColor("Black")
                .buildPower(450)
                .buildPrice(8000000)
                .buildAutoTransmission(true)
                .buildMileage(2)
                .build();
        System.out.println(car);
    }
}