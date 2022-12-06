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
    boolean result1 = false;
    boolean result2 = false;
    boolean result3 = false;
    boolean result4 = false;
    char[] array = password.toCharArray();
    for (char x : array) {
        if (Character.isUpperCase(x)) {
            result1 = true;
        }
        if (Character.isLowerCase(x)) {
            result2 = true;
        }
        if (Character.isDigit(x)) {
            result3 = true;
        }
        if (!Character.isUpperCase(x) && !Character.isLowerCase(x) && !Character.isDigit(x)) {
            result4 = true;
        }
    }
    if (!result1) {
        throw new IllegalArgumentException("Password should contain at least one uppercase letter");
    }
    if (!result2) {
        throw new IllegalArgumentException("Password should contain at least one lowercase letter");
    }
    if (!result3) {
        throw new IllegalArgumentException("Password should contain at least one figure");
    }
    if (!result4) {
        throw new IllegalArgumentException("Password should contain at least one special symbol");
    }
    if (password.toLowerCase().contains("qwerty")) {
        throw new IllegalArgumentException("Password shouldn't contain substrings: "
                +
                " qwerty, 12345, password, admin, user");
    }
    if (password.contains("12345")) {
        throw new IllegalArgumentException("Password shouldn't contain substrings:"
                +
                " qwerty, 12345, password, admin, user");
    }
    if (password.toLowerCase().contains("password")) {
        throw new IllegalArgumentException("Password shouldn't contain substrings:"
                +
                " qwerty, 12345, password, admin, user");
    }
    if (password.toLowerCase().contains("admin")) {
        throw new IllegalArgumentException("Password shouldn't contain substrings:"
                +
                " qwerty, 12345, password, admin, user");
    }
    if (password.toLowerCase().contains("user")) {
        throw new IllegalArgumentException("Password shouldn't contain substrings:"
                +
                " qwerty, 12345, password, admin, user");
    }
    return password;
    }

    public static void main(String[] args) {
        System.out.println(validate("ssssssssqeQauSER5@"));
    }
}
