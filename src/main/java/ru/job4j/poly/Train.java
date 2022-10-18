package ru.job4j.poly;

public class Train implements Vechicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " - поезд передвигается по рельсам");
    }
}
