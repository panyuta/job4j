package ru.job4j.condition;

public class SqArea {
    public int square(int p, int k) {
        double h = p * k / (2 * (1 + k));
        double w = h / k;
        return ((int) (h * w));
    }
}
