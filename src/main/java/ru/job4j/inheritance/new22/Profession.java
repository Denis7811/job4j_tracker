package ru.job4j.inheritance.new22;

public class Profession {
    private boolean degree;

    public Profession(boolean degree) {
        this.degree = degree;
    }
}

class Engineer extends Profession {
    private int experience;

    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}

class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int experience, boolean degree) {
        super(experience, degree);
        this.programLang = programLang;
    }

    public static void main(String[] args) {
        Programmer p = new Programmer("MGU", 10, true);
    }
}
