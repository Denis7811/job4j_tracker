package ru.job4j.encapsulation.new2022;

public class Police {
    public static void main(String[] args) {
        /*License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel()
                + " : " + license.getCode() + " " + license.getCreated());*/
        License lic1 = new License("Mers", "112");
        System.out.println(lic1.getOwner() + " " + lic1.getCode());
    }
}