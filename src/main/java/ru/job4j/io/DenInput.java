package ru.job4j.io;
import java.util.Scanner;

public class DenInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name + " введенное слово");
    }
}
