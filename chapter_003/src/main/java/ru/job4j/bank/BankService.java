package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return Optional.of(users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst().orElse(null));
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> userRequisite = Optional.empty();
        if (user.isPresent()) {
            userRequisite = Optional.of(users.get(user).stream().filter(account -> account.getRequisite().equals(requisite)).findFirst().orElse(null));
        }
        return userRequisite;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()) {
            if (srcAccount.get().getBalance() >= amount) {
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}