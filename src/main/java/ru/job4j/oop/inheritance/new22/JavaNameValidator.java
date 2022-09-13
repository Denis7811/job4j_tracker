package ru.job4j.oop.inheritance.new22;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isEmpty() || !Character.isLowerCase(name.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!(isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)
                    || Character.isDigit(code))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code > 65 && code < 90);

    }

    public static boolean isLowerLatinLetter(int code) {
        return (code > 97 && code < 122);
    }

   /* public static void main(String[] args) {
        JavaNameValidator j = new JavaNameValidator();
        System.out.println(j.isLowerLatinLetter(98));
    }*/
}
