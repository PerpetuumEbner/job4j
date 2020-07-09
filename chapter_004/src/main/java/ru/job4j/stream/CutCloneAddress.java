package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CutCloneAddress {
    public List<Address> collect(List<Address> address) {
        Comparator<Address> addressComparator = Comparator.comparing(Address::getCity);
        address.sort(addressComparator);
        return address.stream().distinct().collect(Collectors.toList());
    }
}