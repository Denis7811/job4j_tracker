package ru.job4j.inheritance;

public class Surgeon  extends Doctor {
    private String scalpel;

    public Surgeon(String name, String surname, String education, String birthday,
                   String university, String scalpel) {
        super(name, surname, education, birthday, university);
        this.scalpel = scalpel;
    }

    public void scalpelSteel(String scalpel) {

    }
}
