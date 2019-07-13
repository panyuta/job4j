package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SqAreaTest {
    @Test
    public void p4k1s1() {
        SqArea sq = new SqArea();
        assertThat(sq.square(4, 1), is(1));
    }

    @Test
    public void p6k2s2() {
        SqArea sq = new SqArea();
        assertThat(sq.square(6, 2), is(2));
    }
}