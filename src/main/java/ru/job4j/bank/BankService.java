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
        return users.remove(new User(passport, "")) != null;
    }

    public void addAccount(String passport, Account account) {
        User findByPassport = findByPassport(passport);
        if (findByPassport != null) {
            if (!users.get(findByPassport).contains(account)) {
                users.get(findByPassport).add(account);
            }
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
        User uPassport = findByPassport(passport);
        if (uPassport != null) {
            for (Account account : users.get(uPassport)) {
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
        Account uSrc = findByRequisite(srcPassport, srcRequisite);
        Account uDest = findByRequisite(destPassport, destRequisite);
            if (uSrc != null && uDest != null && uSrc.getBalance() >= amount) {
                uSrc.setBalance(uSrc.getBalance() - amount);
                uDest.setBalance(uDest.getBalance() + amount);
                rsl = true;
            }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
