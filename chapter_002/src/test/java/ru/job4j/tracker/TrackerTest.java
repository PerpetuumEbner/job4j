package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllItem() {
        Tracker tracker = new Tracker();
        Item itemOne = new Item("test1");
        tracker.add(itemOne);
        Item itemTwo = new Item("test2");
        tracker.add(itemTwo);
        Item[] expected = {itemOne, itemTwo};
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item[] expected  = {item};
        Item[] result = tracker.findByName("test1");
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("tesr1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
}