package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String excavator;

    public Builder(String name, String surname, String education, String birthday,
                   String country, String excavator) {
        super(name, surname, education, birthday, country);
        this.excavator = excavator;
    }

    public void excavateEarth(String excavator) {
    }
}
