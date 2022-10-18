package ru.job4j.poly;

public class Airplane implements Vechicle {


    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " - самолет летает по воздуху");
    }
}
