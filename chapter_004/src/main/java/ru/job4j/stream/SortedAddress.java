package ru.job4j.stream;

import java.util.Comparator;

public class SortedAddress implements Comparator<Address> {
    @Override
    public int compare(Address a, Address b) {
        return a.getCity().compareTo(b.getCity());
    }
}