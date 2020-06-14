package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobComparatorTest {
    @Test
    public void whenJobNameDecrease() {
        Comparator<Job> comNameDec = new JobNameDecrease();
        int rsl = comNameDec.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobNameIncrease() {
        Comparator<Job> comNameInc = new JobNameIncrease();
        int rsl = comNameInc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobPriorityDecrease() {
        Comparator<Job> comPriorityDec = new JobPriorityDecrease();
        int rsl = comPriorityDec.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobPriorityIncrease() {
        Comparator<Job> comPriorityInc = new JobPriorityIncrease();
        int rsl = comPriorityInc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobNameAndPriorityIncrease() {
        Comparator<Job> cmpNamePriorityInc = new JobNameIncrease().thenComparing(new JobPriorityIncrease());
        int rsl = cmpNamePriorityInc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobNameAndPriorityDecrease() {
        Comparator<Job> cmpNamePriorityDec = new JobNameDecrease().thenComparing(new JobPriorityDecrease());
        int rsl = cmpNamePriorityDec.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}