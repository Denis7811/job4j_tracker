package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Clean code", 2);
        Book book1 = new Book("Java", 3);
        Book book2 = new Book("3 мушкетера", 1);
        Book book3 = new Book("Думай медленно", 4);
        Book[] libraryArray = new Book[4];
        libraryArray[0] = book0;
        libraryArray[1] = book1;
        libraryArray[2] = book2;
        libraryArray[3] = book3;
        for (Book book : libraryArray) {
            System.out.println(book.getNameBook() + " - " + book.getCountBook());
        }
        System.out.println(" ");
        Book temp = libraryArray[0];
        libraryArray[0] = libraryArray[3];
        libraryArray[3] = temp;
        for (Book book : libraryArray) {
            System.out.println(book.getNameBook() + " - " + book.getCountBook());
        }
        System.out.println(" ");
        for (int index = 0; index < libraryArray.length; index++) {
            Book book = libraryArray[index];
            System.out.println(book.getNameBook());
        }
        for (int index = 0; index < libraryArray.length; index++) {
            Book book = libraryArray[index];
            if (Objects.equals(book.getNameBook(), "Clean code")) {
                System.out.println(book.getNameBook() + " - " + book.getCountBook());
            }
        }
    }
}
