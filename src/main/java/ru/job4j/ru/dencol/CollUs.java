package ru.job4j.ru.dencol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollUs {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String str : collection) {
            System.out.print(str + " ");
        }
        Collection<String> list = new ArrayList<>();
        list.add("Den");
        list.addAll(collection);
        list.add("Vova");
        System.out.println();
        for (String str : list) {
            System.out.print(str + " ");
        }
        list.remove("two");
        System.out.println();
        System.out.println("После удаления");
        for (String str : list) {
            System.out.print(str + " ");
        }
    }
}

    class CollUs1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        for (String str : collection) {
            System.out.print(str + " ");
        }
        Collection<String> list = new ArrayList<>(collection);
        list.add("Den");
        list.addAll(collection);
        list.add("Vova");
        System.out.println();
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        list.removeAll(collection);
        System.out.println("После удаления");
        for (String str : list) {
            System.out.print(str + " ");
        }
    }
}

    class CollUs3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        System.out.println("Razmer raven " + collection.size());
        System.out.println("Sodergit element two - " + collection.contains("two"));
        System.out.println("Massiv " + Arrays.toString(collection.toArray()));
        collection.clear();
        System.out.println("Posle ochistki pustoi - " + collection.isEmpty());
    }
}
