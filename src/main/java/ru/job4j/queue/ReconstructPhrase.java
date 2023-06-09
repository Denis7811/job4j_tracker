package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        int size = evenElements.size();
        StringBuilder str = new StringBuilder();
        for (int d = 0; d < size; d++) {
            Character character = evenElements.poll();
            if (d % 2 == 0) {
                str.append(character);
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        int size = descendingElements.size();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            Character character = descendingElements.pollLast();
            str.append(character);
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }

    public static void main(String[] args) {
        Deque<Character> evenElements = new LinkedList<>();
        evenElements.add('D');
        evenElements.add('e');
        evenElements.add('n');
        evenElements.add('a');
        for (Character str : evenElements) {
            System.out.println(str);
        }
    }
}
