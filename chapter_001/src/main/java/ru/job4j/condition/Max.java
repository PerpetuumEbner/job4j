package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int straight) {
        return max(left, max(right, straight));
    }

    public static int max(int left, int right, int straight, int back) {
        return max(left, max(right, max(straight, back)));
    }
}
