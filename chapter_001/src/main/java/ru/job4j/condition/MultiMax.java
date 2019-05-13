package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second) {
        return ((first > second) ? first : second);
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}