package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FunctionCalculatorTest {
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenLinearFunctionThenLinearResults16() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 3 * x + 1);
        List<Double> expected = Arrays.asList(16D, 19D, 22D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenQuadraticFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 3 * x * x + x);
        List<Double> expected = Arrays.asList(80D, 114D, 154D);
        assertThat(result).containsAll(expected);
    }

    @Test
    void whenExponentialFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(3, x) + x);
        List<Double> expected = Arrays.asList(248D, 735D, 2194D);
        assertThat(result).containsAll(expected);
    }

}