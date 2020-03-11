package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("Add new Item");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("Show all items");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getName() + item.getId());
                }
            } else if (select == 2) {
                System.out.println("Edit item");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                System.out.println("Enter id :");
                String id = scanner.nextLine();
                if (tracker.replace(id, item)) {
                    System.out.println("successfully");
                } else System.out.println("error");
            } else if (select == 3) {
                System.out.println("Delete item");
                System.out.println("Enter id :");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("successfully");
                } else System.out.println("error");
            } else if (select == 4) {
                System.out.println("Find item by Id");
                System.out.println("Enter id :");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println(item.getName() + item.getId());
            } else if (select == 5) {
                System.out.println("Find items by name");
                String name = scanner.nextLine();
                for (Item item : tracker.findByName(name)) {
                    System.out.println(item.getName() + item.getId());
                }
            } else if (select == 6) {
                System.out.println("Exit Program");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}