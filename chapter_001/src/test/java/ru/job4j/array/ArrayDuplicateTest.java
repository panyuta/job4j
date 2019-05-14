package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arr = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arr.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }
}