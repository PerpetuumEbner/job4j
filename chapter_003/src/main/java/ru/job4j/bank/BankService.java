package ru.job4j.bank;

import java.util.*;

/**
 * Класс позволяет искать и переводить деньги на счет пользователя.
 *
 * @author yustas
 * @version 1.0
 */
public class BankService {
    /**
     * Коллекция типа HashMap содержит всех пользователей и их счета.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     *
     * @param user пользователь, который добавляется в систему.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод, который добавляет новый счёт к пользователю, если он ещё не создан.
     *
     * @param passport паспорт, который необходимо найти.
     * @param account  добавляем счёт к пользователю.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     *
     * @param passport паспорт, по которому необходимо найти пользователя.
     * @return возвращает необходимого пользователя, если не найден, то возвращается null.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst();
    }

    /**
     * Метод ищет пользователя по реквизитам сначало по паспорту, затем получает список счетов и находит в нём нужный
     *
     * @param passport  паспорт пользователя, по котрому нужно найти пользователя.
     * @param requisite реквизиты пользователя, которого нужно найти.
     * @return возврящает необходимый счёт пользователя.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> userRequisite = Optional.empty();
        if (user.isPresent()) {
            userRequisite = users.get(user.get()).stream().filter(account -> account.getRequisite().equals(requisite)).findFirst();
        }
        return userRequisite;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой.
     *
     * @param srcPassport   паспорт пользователя, со счёта которого переводят денги.
     * @param srcRequisite  реквизиты пользователя, со счёта которого переводят денги.
     * @param destPassport  паспорт пользователя, которому перевозят деньги.
     * @param destRequisite реквизиты пользователя, которому перевозят деньги.
     * @param amount        средства. которые необходимо перечислить.
     * @return если счёт не найден или не хватает денег, то возвращается false
     */
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