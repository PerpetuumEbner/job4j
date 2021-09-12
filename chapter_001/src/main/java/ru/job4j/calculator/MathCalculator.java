package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumFunction(double first, double second, double third, double fourth) {
        return difference(first, second) + division(third, fourth);
    }

    public static double sumAllFunction(double first, double second, double third, double fourth) {
        return sum(first, second) + multiply(first, second) + sumFunction(first, second, third, fourth);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumFunction(15, 5, 14, 7));
        System.out.println("Результат расчета равен: " + sumAllFunction(20, 15, 34, 9));
    }
}