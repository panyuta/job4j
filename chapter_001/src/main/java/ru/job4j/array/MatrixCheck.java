package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data[0].length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
            if (data[0][data.length - 1] != data[i][data.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}