package ru.job4j.inheritance.new22;

public class Book {
    private String name;
    private int quantityPages;

    public Book(String name, int quantityPages) {
        this.name = name;
        this.quantityPages = quantityPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int quantityPages) {
        this.quantityPages = quantityPages;
    }
}

class Library {
    public static void main(String[] args) {
        Book book0 = new Book("3 mushketera", 320);
        Book book1 = new Book("Upravlenie gnevom", 423);
        Book book2 = new Book("Vibor", 365);
        Book book3 = new Book("Clean code", 1261);
        Book[] booAr = new Book[4];
        booAr[0] = book0;
        booAr[1] = book1;
        booAr[2] = book2;
        booAr[3] = book3;
        for (int index = 0; index < booAr.length; index++) {
            Book bk = booAr[index];
            System.out.println(bk.getName() + " - " + bk.getQuantityPages());
        }
        System.out.println();
        Book book4 = booAr[0];
        booAr[0] = booAr[3];
        booAr[3] = book4;
        System.out.println();
        for (int index = 0; index < booAr.length; index++) {
            Book bk = booAr[index];
            System.out.println(bk.getName() + " - " + bk.getQuantityPages());
        }
        System.out.println();
        for (int index = 0; index < booAr.length; index++) {
            Book bk = booAr[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getQuantityPages());
            }
        }
    }
}
