package ru.job4j.ru.dencol;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add(null);
        queue.add("second");
        queue.add(null);

        for (String string : queue) {
            System.out.println(string);
        }
        String a;
        a = queue.poll();

        for (String string : queue) {
            System.out.println(string);
        }
        System.out.println(queue.peek());
    }
}
