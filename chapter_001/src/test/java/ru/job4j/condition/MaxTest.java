package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        Max max = new Max();
        int result = max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3Then3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3Of3Then2() {
        Max max = new Max();
        int result = max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2Of3Then2() {
        Max max = new Max();
        int result = max.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4Of4Then4() {
        Max max = new Max();
        int result = max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax2Of4Then2() {
        Max max = new Max();
        int result = max.max(2, 2,2,2);
        assertThat(result, is(2));
    }
}