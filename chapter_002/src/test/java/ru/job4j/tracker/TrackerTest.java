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
        Item[] result = {itemOne, itemTwo};
        assertThat(tracker.findAll(), is(result));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item itemOne = new Item("test1");
        tracker.add(itemOne);
        Item itemTwo = new Item("test2");
        tracker.add(itemTwo);
        Item[] result = tracker.findByName(itemTwo.getName());
        assertThat(result[0], is(itemTwo));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("tesr1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }
}