package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class Lis1 {
    private String owner;

    public Lis1(String owner){
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lis1 lis1 = (Lis1) o;
        return owner.equals(lis1.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner);
    }

    public static void main(String[] args) {
        Lis1 l1= new Lis1("DDDD");
        Lis1 l2= new Lis1("DDDD");
        System.out.println(Objects.equals(l1, l2));
        /*
        System.out.println(l1.equals(l2));
        String s1 = "HHHH";
        String s2 = "HHHH";
        System.out.println(Objects.equals(s1, s2));*/
    }
}
