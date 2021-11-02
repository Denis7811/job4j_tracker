package ru.job4j.oop.inheritance;

public class Dentist  extends Doctor {

    private String drill;

    public Dentist(String university, String drill) {
        super(university);
        this.drill = drill;
    }

    public void drillName(String drill) {

    }
}
