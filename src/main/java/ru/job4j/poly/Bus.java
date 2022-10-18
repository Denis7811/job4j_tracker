package ru.job4j.poly;

public class Bus  implements Vechicle {
    @Override
    public void move() {

        System.out.println(getClass().getSimpleName()
                + " - автобус двигается по скоростным трассам");
    }
}
