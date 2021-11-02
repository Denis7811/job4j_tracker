package ru.job4j.oop.inheritance;

public class Engineer extends Profession {

    private String country;

    public Engineer(String name, String country) {
        super(name);
        this.country = country;
    }

    public Engineer(String country) {
    }

    public void countryName(String country) {

    }
}
