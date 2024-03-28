package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    @Test
    public void whenCompatorDescByNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobByName()
                .thenComparing(new JobByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorByEqualNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobByName()
                .thenComparing(new JobByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 3),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isGreaterThan((0));
    }

    @Test
    public void whenCompatorByEqualNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 3),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan((0));
    }

    @Test
    public void whenCompatorByDescEqualProrityAndDescName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority()
                .thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan((0));
    }

    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpName = new JobByName();
        int rsl = cmpName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByPrority() {
        Comparator<Job> cmpPrority = new JobByPriority();
        int rsl = cmpPrority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isGreaterThan((0));
    }

    @Test
    public void whenCompatorDescByPrority() {
        Comparator<Job> cmpDescPrority = new JobDescByPriority();
        int rsl = cmpDescPrority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan((0));
    }
}