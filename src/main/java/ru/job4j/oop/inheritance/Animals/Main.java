package ru.job4j.oop.inheritance.Animals;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal medved = new Bear();
        Animal medved1 = new Bear();
        Animal snake = new Snake();

        medved1.voice();
        dog.voice();
        cat.voice();
        medved.voice();
        snake.voice();
    }
}
