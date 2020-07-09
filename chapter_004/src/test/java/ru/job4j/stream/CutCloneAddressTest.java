package ru.job4j.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

public class CutCloneAddressTest {
    @Test
    public void whenThereNoRepeatingElements() {
        CutCloneAddress cutCloneAddress = new CutCloneAddress();
        List<Address> address = Arrays.asList(
                new Address("City17", "Street3", 3, 58),
                new Address("City15", "Street2", 2, 75),
                new Address("City13", "Street1", 1, 12),
                new Address("City19", "Street4", 4, 65),
                new Address("City17", "Street3", 3, 47));

        List<Address> expected = address.stream().filter(address1 -> address1.getCity());

        List<Address> result = Arrays.asList(
                new Address("City13", "Street1", 1, 12),
                new Address("City15", "Street2", 2, 75),
                new Address("City17", "Street3", 3, 58),
                new Address("City19", "Street4", 4, 65));

        assertThat(expected, is(result));
    }
}