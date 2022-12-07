package ru.job4j.excep;

import java.util.Locale;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
    if (password == null) {
        throw new IllegalArgumentException("Password can't be null");
        }
    if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
    boolean upper = false;
    boolean lower = false;
    boolean digit = false;
    boolean figure = false;
    char[] array = password.toCharArray();
    for (char x : array) {
        if (Character.isUpperCase(x)) {
            upper = true;
        }
        if (Character.isLowerCase(x)) {
            lower = true;
        }
        if (Character.isDigit(x)) {
            digit  = true;
        }
        if (!Character.isUpperCase(x) && !Character.isLowerCase(x) && !Character.isDigit(x)) {
            figure = true;
        }
        if (upper && lower && digit && figure) {
            break;
        }
    }
    if (!upper) {
        throw new IllegalArgumentException("Password should contain at least one uppercase letter");
    }
    if (!lower) {
        throw new IllegalArgumentException("Password should contain at least one lowercase letter");
    }
    if (!digit) {
        throw new IllegalArgumentException("Password should contain at least one figure");
    }
    if (!figure) {
        throw new IllegalArgumentException("Password should contain at least one special symbol");
    }
    String[] valid = {"qwerty", "12345", "password", "admin", "user"};
        for (int i = 0; i < valid.length; i++) {
            if (password.toLowerCase().contains(valid[i])) {
                throw new IllegalArgumentException("Password shouldn't contain substrings:"
                        +
                        " qwerty, 12345, password, admin, user");
            }
        }
    return password;
    }

    public static void main(String[] args) {
        System.out.println(validate("ssssssssqeQauSER5@"));
    }
}
