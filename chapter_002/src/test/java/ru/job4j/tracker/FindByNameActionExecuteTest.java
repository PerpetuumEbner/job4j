package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionExecuteTest {
    @Test
    public void whenNameActionExecute() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = System.out;
        System.setOut(new PrintStream(out));
        MemTracker tracker = new MemTracker();
        Item item = new Item("test1");
        tracker.add(item);
        FindByNameItemAction action = new FindByNameItemAction();
        action.execute(new StubInput(new String[]{"test1"}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item.getId() + " " + item.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(printStream);
    }
}