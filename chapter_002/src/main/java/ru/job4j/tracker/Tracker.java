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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return index != -1 ? true : false;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        System.arraycopy(items, index + 1, items, index, position - 1);
        items[position - 1] = null;
        position--;
        return index != -1 ? true : false;
    }
}