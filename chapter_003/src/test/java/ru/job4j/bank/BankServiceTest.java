package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        Optional<BankService> bank = Optional.of(new BankService());
        bank.get().addUser(user.get());
        assertThat(bank.get().findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        Optional<BankService> bank = Optional.of(new BankService());
        bank.get().addUser(user.get());
        bank.get().addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertNull(bank.get().findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        Optional<BankService> bank = Optional.of(new BankService());
        bank.get().addUser(user.get());
        bank.get().addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertThat(bank.get().findByRequisite("3434", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        Optional<BankService> bank = Optional.of(new BankService());
        bank.get().addUser(user.get());
        bank.get().addAccount(user.get().getPassport(), new Account("5546", 150D));
        bank.get().addAccount(user.get().getPassport(), new Account("113", 50D));
        bank.get().transferMoney(user.get().getPassport(), "5546", user.get().getPassport(), "113", 150D);
        assertThat(bank.get().findByRequisite(user.get().getPassport(), "113").get().getBalance(), is(200D));
    }
}