package ru.job4j.encapsulation.new2022;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student denis = new Student();
        denis.setName("Denis");
        denis.setGroup(112);
        denis.setDate(new Date());
        System.out.println("name - " + denis.getName() + ". group - " + denis.getGroup()
                + ". date - " + denis.getDate());
    }
}
