package ru.job4j.tracker;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class SqlTrackerTest {
    public Connection init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void createItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name"));
            assertThat(tracker.findByName("name").size(), is(1));
        }
    }

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("name"));
            assertThat(tracker.findById("name"), is(1));
        }
    }

    @Test
    public void whenReplace() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item bug = new Item("name");
            tracker.add(bug);
            String id = bug.getId();
            Item bugWithDesc = new Item("Name with description");
            tracker.replace(id, bugWithDesc);
            assertThat(tracker.findById(id).getName(), is("Name with description"));
        }
    }

    @Test
    public void whenFindAll() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item itemOne = new Item("name");
            tracker.add(itemOne);
            Item itemTwo = new Item("id");
            tracker.add(itemTwo);
            List<Item> result = tracker.findAll();
            assertThat(result.size(), is(2));
        }
    }

    @Test
    public void whenFindByName() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("name");
            tracker.add(item);
            List<Item> expected = new ArrayList<>();
            expected.add(item);
            List<Item> result = tracker.findByName("name");
            assertThat(result, is(expected));
        }
    }

    @Test
    public void whenFindById() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("name");
            tracker.add(item);
            Item result = tracker.findById(item.getId());
            assertThat(result.getName(), is(item.getName()));
        }
    }

    @Test
    public void whenDelete() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item bug = new Item("name");
            tracker.add(bug);
            String id = bug.getId();
            tracker.delete(id);
            assertThat(tracker.findById(id), is(nullValue()));
        }
    }
}