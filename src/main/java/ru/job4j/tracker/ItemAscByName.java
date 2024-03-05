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
        List<Item> items = Arrays.asList(
                new Item("Xmen"),
                new Item("Azbuka"),
                new Item("Bazuka")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Azbuka"),
                new Item("Bazuka"),
                new Item("Xmen")
        );
        boolean isEqual = items.equals(expected);
        System.out.println(isEqual);
    }
}

