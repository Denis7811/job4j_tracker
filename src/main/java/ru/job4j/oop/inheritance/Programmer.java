package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {

    private String monitor;

    public Programmer(String country, String monitor) {
        super(country);
        this.monitor = monitor;
    }

    public void monitorName(String monitor) {

    }
}


