package ru.job4j.excep;

public final class Airbus extends Aircraft {
   private static int count_engine = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета : " + name);
    }

    public void printCountEngine() {
        count_engine = name.equals("A380") ? 4 : 2;
        System.out.println("Количество двигателей равно: " + count_engine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}