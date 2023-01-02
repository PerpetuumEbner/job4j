package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        int size = evenElements.size();
        StringBuilder result = new StringBuilder("");
        for (int index = 0; index < size; index++) {
            String string = evenElements.pollFirst().toString();
            if (index % 2 == 0) {
                result = new StringBuilder(result + string);
            }
        }
        return String.valueOf(result);
    }

    private String getDescendingElements() {
        int size = descendingElements.size();
        StringBuilder result = new StringBuilder("");
        for (int index = 0; index < size; index++) {
            result = new StringBuilder(result + descendingElements.pollLast().toString());
        }
        return String.valueOf(result);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}