package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CutCloneAddress {
    public List<Address> collect(List<Address> address) {
        SortedAddress sortedAddress = new SortedAddress();
        address.sort(sortedAddress);
        return address.stream().distinct().collect(Collectors.toList());
    }
}