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
     *
     * @param first First argement
     * @param second Second argument
     */

    private static final int X = 5;

    public static int sum(int y) {
        return y + X;
    }

    public static int minus(int y) {
        return y - X;
    }

    public int divide(int y) {
        return y / X;
    }

    public int multi(int y) {
        return X * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multi(y);
    }

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
        System.out.println(sum(5));
        System.out.println(minus(10));
        System.out.println(new Calculator().divide(13));
        System.out.println(new Calculator().multi(21));
        System.out.println(new Calculator().sumAllOperation(3));
    }
}
