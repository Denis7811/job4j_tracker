package ru.job4j.inheritance.new22;

import java.util.Date;

public class Student {
    private String name;
    private String group;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

class College {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Denis");
        st1.setGroup("PGS112");
        st1.setDate(new Date());
        System.out.println("Name - " + st1.getName() + ", gruppa - " + st1.getGroup()
                + ", data - " + st1.getDate());
    }
}
