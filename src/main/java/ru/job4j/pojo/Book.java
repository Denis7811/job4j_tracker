package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int countBBook;

    public Book(String nameBook, int countBook) {
        this.nameBook = nameBook;
        this.countBook = countBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getCountBook() {
        return countBook;
    }

    public void setCountBook(int countBook) {
        this.countBook = countBook;
    }
}
