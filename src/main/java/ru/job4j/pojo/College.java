package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("Василий Григорьевич Куролесов");
        student01.setGroup("355");
        student01.setDateIn(new Date());
        String ln = System.lineSeparator();

        System.out.println("Ф.И.О. студента: " + student01.getName() + ln + "Группа: "
                + student01.getGroup() + ln + "Дата: " + student01.getDateIn());
    }
}
