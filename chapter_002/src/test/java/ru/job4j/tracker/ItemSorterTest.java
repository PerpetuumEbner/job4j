package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {
    @Test
    public void sortedComparable() {
        List<Item> items = Arrays.asList(
                new Item("Шилдт"),
                new Item("Хостманн"),
                new Item("Бейтс")
        );
        new ItemSorter().sortComparable(items);
        List<Item> expected = Arrays.asList(
                new Item("Бейтс"),
                new Item("Хостманн"),
                new Item("Шилдт")
        );
        assertThat(items, is(expected));
    }
}