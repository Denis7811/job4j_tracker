package ru.job4j.oop.inheritance.Animals;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Собачка лает Гав! Гав!");
    }
}
