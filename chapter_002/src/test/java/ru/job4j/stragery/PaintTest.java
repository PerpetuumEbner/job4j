package ru.job4j.stragery;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint.draw(new Square());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("++++").append(System.lineSeparator())
                .append("+  +").append(System.lineSeparator())
                .append("+  +").append(System.lineSeparator())
                .append("++++").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint.draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("   +   ").append(System.lineSeparator())
                .append("  +++  ").append(System.lineSeparator())
                .append(" +++++ ").append(System.lineSeparator())
                .append("+++++++").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
        System.setOut(stdout);
    }
}