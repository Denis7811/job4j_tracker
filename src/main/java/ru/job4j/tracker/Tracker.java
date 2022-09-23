package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findByIdOld(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                rsl[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item first = new Item(10, "First");
        Item second = new Item("Second2");
        Item second2 = new Item();
        Item second3 = new Item(1, "Second2");
        Item second4 = new Item("Second2");
        tracker.add(first);
        tracker.add(second);
        tracker.add(second2);
        tracker.add(second3);
        tracker.add(second4);
        System.out.println(tracker.indexOf(4));
        /*Item[] rsl = tracker.findAll();
        for (int index = 0; index < rsl.length; index++) {
            Item item = rsl[index];
            System.out.println(item.getId() + " " + item.getName());
        }*/
    }
}