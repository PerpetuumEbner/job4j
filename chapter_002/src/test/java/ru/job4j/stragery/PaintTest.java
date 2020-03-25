package ru.job4j.stragery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(out));
    }

    @After
    public void backOutput() {
        System.setOut(new PrintStream(stdout));
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        Paint.draw(new Square());
        assertThat(out.toString(), is(new StringBuilder()
                .append("++++").append(System.lineSeparator())
                .append("+  +").append(System.lineSeparator())
                .append("+  +").append(System.lineSeparator())
                .append("++++").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }

    @Test
    public void whenDrawTriangle() {
        Paint.draw(new Triangle());
        assertThat(out.toString(), is(new StringBuilder()
                .append("   +   ").append(System.lineSeparator())
                .append("  +++  ").append(System.lineSeparator())
                .append(" +++++ ").append(System.lineSeparator())
                .append("+++++++").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }
}