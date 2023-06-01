package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

public class UniqueText {

    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String value : text) {
            if (!check.contains(value)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
