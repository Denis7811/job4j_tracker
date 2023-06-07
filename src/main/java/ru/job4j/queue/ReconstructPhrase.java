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
        for (int i = 0; i < size; i++) {
            Character character = evenElements.poll();
            if (i % 2 == 0) {
                str.append(character);
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        Iterator<Character> iterator = descendingElements.descendingIterator();
        StringBuilder str = new StringBuilder();
        while (iterator.hasNext()) {
            str.append(iterator.next());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
