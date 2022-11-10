package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String monitor;

    public Programmer(String name, String surname, String education, String birthday,
                      String country, String monitor) {
        super(name, surname, education, birthday, country);
        this.monitor = monitor;
    }

    public void monitorName(String monitor) {
    }
}


