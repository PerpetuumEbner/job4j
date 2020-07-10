package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenListMatches() {
        Profiles profile = new Profiles();

        Address address1 = new Address("City17", "Street1", 1, 17);
        Address address2 = new Address("City17", "Street2", 2, 24);
        Address address3 = new Address("City17", "Street3", 3, 36);
        Address address4 = new Address("City17", "Street3", 4, 47);

        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(address1));
        profiles.add(new Profile(address2));
        profiles.add(new Profile(address3));
        profiles.add(new Profile(address4));

        List<Address> address = new ArrayList<>();
        address.add(address1);
        address.add(address2);
        address.add(address3);
        address.add(address4);

        assertThat(profile.collect(profiles), is(address));
    }

    @Test
    public void whenThereNoRepeatingElements() {
        List<Address> address = Arrays.asList(
                new Address("City17", "Street3", 3, 58),
                new Address("City15", "Street2", 2, 75),
                new Address("City13", "Street1", 1, 12),
                new Address("City19", "Street4", 4, 65),
                new Address("City17", "Street3", 3, 47));

        List<Profile> profiles = address.stream().map(Profile::new).collect(Collectors.toList());
        List<Address> result = new Profiles().removeDup(profiles);

        List<Address> expected = Arrays.asList(
                new Address("City13", "Street1", 1, 12),
                new Address("City15", "Street2", 2, 75),
                new Address("City17", "Street3", 3, 58),
                new Address("City19", "Street4", 4, 65));

        assertThat(expected, is(result));
    }
}