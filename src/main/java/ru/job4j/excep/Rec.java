package ru.job4j.excep;

public class Rec {
    public static void recursionFucn() {
        System.out.println("Привет, JavaRush!");
        recursionFucn();
    }

    public static void main(String[] args) {
        recursionFucn();

    }
}
