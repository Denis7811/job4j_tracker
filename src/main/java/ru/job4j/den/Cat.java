package ru.job4j.den;

public class Cat {
    private String food;

    public String getFood() {
        return food;
    }

    public void show() {
        System.out.println(this.food);
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.show();
        black.music();
        System.out.println(black.sound());
    }
}


