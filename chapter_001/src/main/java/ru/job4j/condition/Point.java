package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public Point(int fist, int second) {
        this.x = fist;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt((Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2)));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}