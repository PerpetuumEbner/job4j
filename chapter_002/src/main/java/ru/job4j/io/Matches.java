package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра в спички. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        System.out.println("Нажмите enter что-бы начать:");
        String string = scanner.nextLine();

        boolean variable;
        int winner = 0;
        int quantity = 11;

        while (quantity > 0) {
            for (int playerCount = 2; playerCount > 0; playerCount--) {
                if (quantity > 0) {
                    if (playerCount == 2) {
                        System.out.println("Игрок №1 берет спички:");
                        winner = 1;

                    } else if (playerCount == 1) {
                        System.out.println("Игрок №2 берет спички:");
                        winner = 2;
                    }

                    variable = true;
                    while (variable) {
                        int select = Integer.valueOf(scanner.nextLine());

                        if (select <= 0) {
                            System.out.println("Колличество не может быть отрицательным или равным нулю.");
                            variable = true;
                        } else if (select > 3) {
                            System.out.println("Вы не можите взять больше трех спичек.");
                            variable = true;
                        } else {
                            System.out.println("Вы выбрали " + select + " спичку(ки).");
                            quantity = quantity - select;
                            System.out.println("Осталось " + quantity + " спичек(ка)." + '\n');
                            variable = false;
                        }
                    }
                } else break;
            }
        }
        if (winner == 1) {
            System.out.println("Выиграл игрок №1!");
        } else System.out.println("Выиграл игрок № 2!");
    }
}