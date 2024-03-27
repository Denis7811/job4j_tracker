package ru.job4j.collection;

import java.util.Comparator;
import java.lang.Character;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = Math.min(left.length(), right.length());
        int result1 = 0;
        for (int i = 0; i < size; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            return Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
