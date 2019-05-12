package ru.job4j.calculator;

/**
 * Class Calculator Калькулятор, поддерживающий операции +, -, *, /.
 * @author panyuta
 * @since 12.05.2019
 * @version 1.0
 */
public class Calculator {
    /**
     * Сложение 2х чисел.
     * @param first - Первое число.
     * @param second - Второе число.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Вычитание одного числа из другого.
     * @param first - Первое число.
     * @param second - Второе число.
     */
    public double substract(double first, double second) {
        return first - second;
    }

    /**
     * Деление одного числа на другое.
     * @param first - Первое число.
     * @param second - Второе число.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Умножение одного числа на другое.
     * @param first - Первое число.
     * @param second - Второе число.
     */
    public double multiply(double first, double second) {
        return first * second;
    }
}
