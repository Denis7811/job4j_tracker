package ru.job4j.collection;

import java.util.Comparator;
import java.lang.Character;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }
        result = result == 0 ? Integer.compare(left.length(), right.length())
        : result;
        return result;
        }
}
