package ru.job4j.oop;

public class Denis1 {
    private String food;
    private String name;

    public void show() {
        System.out.println("Kot po imeni " + this.name + " love eat " + this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public void nick(String nickName) {
        this.name = nickName;
    }

    public static void main(String[] args) {
        Denis1 gav = new Denis1();
        gav.eat("kotleta");
        gav.nick("GAV");
        gav.show();
    }
}
