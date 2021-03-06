package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Stanislav Yulin
 * @version 1.0
 * @since 30.01.2020
 */
public class Calculator {
    /**
     * Math operations
     * @param first First argement
     * @param second Second argument
     */
    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void subtract(int first, int second) {
        int result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
