package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ItemAscByName implements Comparator<Item> {
    @Override
    public int compare(Item left, Item right) {
        return left.getName().compareTo(right.getName());
    }

    public static void main(String[] args) {
        System.out.println("!");
    }
}

