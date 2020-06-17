package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;

        if (money < price) {
            System.out.println("У вас недостаточно денег.");
        } else {
            for (int index = 0; index < coins.length; index++) {
                while (surrender - coins[index] >= 0) {
                    surrender = surrender - coins[index];
                    rsl[size] = coins[index];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}