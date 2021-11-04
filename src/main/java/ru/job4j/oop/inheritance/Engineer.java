package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String country;

    public Engineer(String name, String surname, String education,
                    String birthday, String country) {
        super(name, surname, education, birthday);
        this.country = country;
    }

    public void countryName(String country) {
    }
}
