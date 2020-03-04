package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
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
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsByName = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                if (item.getName().equals(key)) {
                    itemsByName[size] = item;
                    size++;
                }
            }
        }
        return Arrays.copyOf(itemsByName, size);
    }

    public Item findById(String id) {
        Item itemfindById = null;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null) {
                if (item.getId().equals(id)) {
                    itemfindById = item;
                } else return null;
            }
        }
        return itemfindById;
    }
}