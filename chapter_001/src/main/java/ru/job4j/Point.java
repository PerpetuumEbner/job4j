package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        double resultFirst = distance(0, 0, 2, 0);
        System.out.println("First result (0, 0) to (2, 0) " + resultFirst);

        double resultSecond = distance(6, 5, 4, 3);
        System.out.println("Second result (6, 5) to (4, 3) " + resultSecond);

        double resultThird = distance(10, 6, 15, 20);
        System.out.println("Third result (10, 6) to (15, 20) " + resultThird);
    }
}
