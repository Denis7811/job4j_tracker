package ru.job4j.oop.inheritance.Animals;

public class Bear extends Animal {
    @Override
    public void voice() {
        System.out.println("Мишка говорит : \"Р-р-р!\"");
    }
}
