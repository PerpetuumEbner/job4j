package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("Add new Item");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("Edit item");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        if (tracker.replace(id, item)) {
            System.out.println("successfully");
        } else System.out.println("error");
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("Delete item");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("successfully");
        } else System.out.println("error");
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("Find item by Id");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        System.out.println(item);
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("Find items by name");
        String name = input.askStr("Enter name: ");
        for (Item item : tracker.findByName(name)) {
            System.out.println(item);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                System.out.println("Show all items");
                for (Item item : tracker.findAll()) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
                deteleItem(input, tracker);
            } else if (select == 4) {
                findByIdItem(input, tracker);
            } else if (select == 5) {
                findByNameItem(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}