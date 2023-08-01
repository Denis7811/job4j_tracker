package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public boolean deleteUser(String passport) {
        return users.remove(findByPassport(passport)) != null;
    }

    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            for (Account account1 : users.get(findByPassport(passport))) {
                if (account1.getRequisite().equals(account.getRequisite())) {
                    return;
                }
            }
            users.get(findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            for (Account account : users.get(findByPassport(passport))) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        if (findByPassport(srcPassport) != null && findByPassport(destPassport) != null) {
            if (findByRequisite(srcPassport, srcRequisite) != null
                    && findByRequisite(destPassport, destRequisite) != null
                    && findByRequisite(srcPassport, srcRequisite).getBalance() >= amount) {
                findByRequisite(srcPassport, srcRequisite).setBalance(findByRequisite(srcPassport,
                        srcRequisite).getBalance() - amount);
                findByRequisite(destPassport, destRequisite).
                        setBalance(findByRequisite(destPassport, destRequisite).
                                getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
