package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Den");
        names.add("Alex");
        for (Object value : names) {
            System.out.print(value + " ");
        }
    }
}