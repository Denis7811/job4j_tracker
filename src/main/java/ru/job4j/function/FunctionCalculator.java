package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> listResult = new ArrayList<>();
        for (double i = start; i < end; i++) {
            listResult.add(function.apply(i));
        }
        return listResult;
    }
}
