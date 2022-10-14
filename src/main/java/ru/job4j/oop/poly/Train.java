package ru.job4j.oop.poly;

public class Train implements Vechicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - поезд передвигается по рельсам");
    }
}
