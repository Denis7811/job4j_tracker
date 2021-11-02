package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String excavator;

    public Builder(String country, String excavator) {
        super(country);
        this.excavator = excavator;
    }

    public void excavateEarth(String excavator) {

    }
}
