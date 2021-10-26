package ru.job4j.stream.builder;

/**
 * Класс содержит в себе поля характеристик автомобиля.
 *
 * @author yustas
 * @version 1.0
 */
public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private double price;
    private boolean autoTransmission;
    private int mileage;

    static class Builder implements Specifications {
        private String brand;
        private String model;
        private String color;
        private int power;
        private double price;
        private boolean autoTransmission;
        private int mileage;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildPower(int power) {
            this.power = power;
            return this;
        }

        Builder buildPrice(double price) {
            this.price = price;
            return this;
        }

        Builder buildAutoTransmission(boolean autoTransmission) {
            this.autoTransmission = autoTransmission;
            return this;
        }

        Builder buildMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        /**
         * @return Метод создаёт готовый объект и возвращает его экземпляр.
         */
        @Override
        public Car build() {
            Car carBuilder = new Car();
            carBuilder.brand = brand;
            carBuilder.model = model;
            carBuilder.color = color;
            carBuilder.power = power;
            carBuilder.price = price;
            carBuilder.autoTransmission = autoTransmission;
            carBuilder.mileage = mileage;
            return carBuilder;
        }
    }

    /**
     * @return Метод возвращает строку с характеристиками автомобиля.
     */
    @Override
    public String toString() {
        return "brand: " + brand + System.lineSeparator()
                + "model: " + model + System.lineSeparator()
                + "color: " + color + System.lineSeparator()
                + "power: " + power + System.lineSeparator()
                + "price: " + price + System.lineSeparator()
                + "autoTransmission: " + autoTransmission + System.lineSeparator()
                + "mileage: " + mileage;
    }
}