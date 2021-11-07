package ru.job4j.oop;

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        double tmp = add(second, third);
        return add(first, tmp);
    }

    public static void main(String[] args) {
        Calculator a = new Calculator();
                double dist = a.add(4, 5);
        System.out.println(dist);
    }
}
