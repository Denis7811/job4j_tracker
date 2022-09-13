package ru.job4j.oop.inheritance.new22;

public class Calculator {
    static private int x = 2;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(minus(7));
        System.out.println(c1.divide(5));
        System.out.println(c1.sumAllOperation(2));
    }
}
