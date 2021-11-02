package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String university;

    public Doctor(String university) {
    }

    public Doctor(String name, String university) {
        super(name);
        this.university = university;
    }

    public void universityName(String university) {

    }
}
