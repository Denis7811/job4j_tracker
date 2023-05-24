package ru.job4j.ru.dencol;

import java.util.ArrayList;
import java.util.Arrays;

public class ArListDen {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>(names);
        ArrayList<String> names3 = new ArrayList<>(15);
        ArrayList<String> names4 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric"));
        names.add("Petr");
        names.add("Den");
        names.set(1, "Ivan");
        /*for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.print(value + " ");
        }*/
        names2.addAll(names);
        System.out.println();
        for (Object value : names2) {
            System.out.print(value + " ");
        }
        /*System.out.println();
        for (Object value : names3) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (Object value : names4) {
            System.out.print(value + " ");
        }*/
    }
}
