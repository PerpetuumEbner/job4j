package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random random = new Random();
        return String.valueOf(random.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                itemsByName[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsByName, size);
    }

    public Item findById(String id) {
        Item itemFindById = null;
        for (int index = 0; index < position; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                itemFindById = item;
                break;
            }
        }
        return itemFindById;
    }
}