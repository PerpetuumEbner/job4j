package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {

    @Test
    public void whenStudentHasZeroTo50Points() {
        List<Student> students = Arrays.asList(
                new Student("Антон", 64),
                new Student("Владимир", 15),
                new Student("Светлана", 84),
                new Student("Василий", 6),
                new Student("Мария", 57),
                new Student("Владислав", 95));

        List<Student> expected = students.stream().filter(student -> student.getScore() >= 0 && student.getScore() < 50).collect(Collectors.toList());

        List<Student> result = Arrays.asList(
                new Student("Владимир", 15),
                new Student("Василий", 6));

        assertThat(expected, is(result));
    }

    @Test
    public void whenStudentHas50To70Points() {
        List<Student> students = Arrays.asList(
                new Student("Антон", 64),
                new Student("Владимир", 15),
                new Student("Светлана", 84),
                new Student("Василий", 6),
                new Student("Мария", 57),
                new Student("Владислав", 95));

        List<Student> expected = students.stream().filter(student -> student.getScore() >= 50 && student.getScore() < 70).collect(Collectors.toList());

        List<Student> result = Arrays.asList(
                new Student("Антон", 64),
                new Student("Мария", 57));

        assertThat(expected, is(result));
    }

    @Test
    public void whenStudentHas70To100Points() {
        List<Student> students = Arrays.asList(
                new Student("Антон", 64),
                new Student("Владимир", 15),
                new Student("Светлана", 84),
                new Student("Василий", 6),
                new Student("Мария", 57),
                new Student("Владислав", 95));

        List<Student> expected = students.stream().filter(student -> student.getScore() > 70 && student.getScore() <= 100).collect(Collectors.toList());

        List<Student> result = Arrays.asList(

                new Student("Светлана", 84),
                new Student("Владислав", 95));

        assertThat(expected, is(result));
    }

    @Test
    public void whenConvertListToMap() {
        List<Student> students = Arrays.asList(
                new Student("Антон", 64),
                new Student("Владимир", 15),
                new Student("Светлана", 84),
                new Student("Василий", 6),
                new Student("Мария", 57),
                new Student("Владислав", 95));

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Антон", 64);
        expected.put("Владимир", 15);
        expected.put("Светлана", 84);
        expected.put("Василий", 6);
        expected.put("Мария", 57);
        expected.put("Владислав", 95);

        Map<String, Integer> result = new School().convertListToMap(students);

        assertThat(expected, is(result));
    }

    @Test
    public void whenThereAreDuplicatesInTheList() {
        List<Student> students = Arrays.asList(
                new Student("Антон", 64),
                new Student("Владимир", 15),
                new Student("Светлана", 84),
                new Student("Василий", 6),
                new Student("Мария", 57),
                new Student("Владимир", 15),
                new Student("Светлана", 84),
                new Student("Владислав", 95));

        Map<String, Integer> expected = new HashMap<>();
        expected.put("Антон", 64);
        expected.put("Владимир", 15);
        expected.put("Светлана", 84);
        expected.put("Василий", 6);
        expected.put("Мария", 57);
        expected.put("Владислав", 95);

        Map<String, Integer> result = new School().convertListToMap(students);

        assertThat(expected, is(result));
    }
}