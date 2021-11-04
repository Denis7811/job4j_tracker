package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String university;

    public Doctor(String name, String surname, String education,
                  String birthday, String university) {
        super(name, surname, education, birthday);
        this.university = university;
    }

    public void universityName(String university) {
    }
}
