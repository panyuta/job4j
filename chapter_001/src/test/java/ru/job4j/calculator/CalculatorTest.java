package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubstractTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        double result = calc.substract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDivTenDevideTwoThenFive() {
        Calculator calc = new Calculator();
        double result = calc.div(10D, 2D);
        double expected = 5D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultiplyTwoMultiplyOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.multiply(2D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}