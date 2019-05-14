package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorting = new BubbleSort();
        int[] input = new int[] {3, 2, 5, 4, 1, 7, 9, 10, 8, 6};
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = sorting.sort(input);
        assertThat(result, is(expect));
    }
}