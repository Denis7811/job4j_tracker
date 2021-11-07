package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Clean code", 2);
        Book book1 = new Book("Java", 3);
        Book book2 = new Book("3 мушкетера", 1);
        Book book3 = new Book("Думай медленно", 4);
        Book[] library = new Book[4];
        library[0] = book0;
        library[1] = book1;
        library[2] = book2;
        library[3] = book3;
        for (Book book : library) {
            System.out.println(book.getNameBook() + " - " + book.getCountBook());
        }
        System.out.println(" ");
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (Book book : library) {
            System.out.println(book.getNameBook() + " - " + book.getCountBook());
        }
        System.out.println(" ");
        for (int index = 0; index < library.length; index++) {
            Book book = library[index];
            if (Objects.equals(book.getNameBook(), "Clean code")) {
                System.out.println(book.getNameBook() + " - " + book.getCountBook());
            }
        }
    }
}
