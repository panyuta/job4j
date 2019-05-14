package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int array[]) {
        int tmp;
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }
}