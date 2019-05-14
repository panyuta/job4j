package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void checkSum() {
        Counter check = new Counter();
        int result = check.add(1, 10);
        assertThat(result, is(30));
    }
}
