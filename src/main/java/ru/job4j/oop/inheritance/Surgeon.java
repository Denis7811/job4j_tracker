package ru.job4j.oop.inheritance;

public class Surgeon  extends Doctor {
    private String scalpel;

    public Surgeon(String university, String scalpel) {
        super(university);
        this.scalpel = scalpel;
    }

    public void scalpelSteel(String scalpel) {

    }
}
