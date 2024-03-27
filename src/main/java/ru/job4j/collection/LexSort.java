package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftAr = left.split("\\.");
        String[] rightAr = right.split("\\.");
        int leftInt = Integer.parseInt(leftAr[0]);
        int rightInt = Integer.parseInt(rightAr[0]);
        return Integer.compare(leftInt, rightInt);

    }
}