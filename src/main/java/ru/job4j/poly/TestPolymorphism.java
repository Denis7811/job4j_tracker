package ru.job4j.poly;

public class TestPolymorphism {
    public static void catWalk(Cat cat){
        cat.walk();
    }
    public static void eachAnimalWalk(Animal a){
        a.walk();
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.walk();
        cat.walk();
        dog.walk();
        //catWalk(cat);
        System.out.println();
        Animal c = new Cat();
        Animal d = new Dog();
        eachAnimalWalk(c);
        eachAnimalWalk(d);
        System.out.println();
        eachAnimalWalk(new Cat());
        eachAnimalWalk(new Dog());
    }
}
