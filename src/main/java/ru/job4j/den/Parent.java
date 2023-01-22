package ru.job4j.den;

public class Parent {
    String name;
    int age;

    public Parent() {
    }
    public Parent(int age) {
        this.age = age;
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Parent pr = new Parent();
    }
}

class Child extends Parent {

    private String patronymic;

    public Child() { }

    public Child(String name, int age) {
        super(name, age);
    }

    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }

    public static void main(String[] args) {
        Child ch1 = new Child();
        Child ch2 = new Child( "Son", 12);
        Child ch3 = new Child( "Son", 12, "may");
        System.out.println(ch2.age);
    }
}

class Toy {
    String name;
    int cost;
    String manufacturer;
    int age;

    public Toy(String name, int cost, String manufacturer) {
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
        System.out.println("Конструктор с тремя параметрами");
    }

    public Toy(String name, int cost, String manufacturer, int age) {
        this(name, cost, manufacturer);
        this.age = age;
        System.out.println("Конструктор с четырьмя параметрами");
    }

    public Toy() {
        System.out.println("В конструкторе по умолчанию");
    }
}

class ToyDemo {
    public static void main(String[] args) {
        Toy toy = new Toy("Кукла", 34, "Disney", 3);
    }
}

class IceCream {
    private int weight;

    public IceCream(int weight) {
        this.weight = weight;
    }

    public int price() {
        return weight * 100;
    }

    public static void print(){
        System.out.println("Roditel");
    }

    public static void main(String[] args) {
        IceCream ic = new IceCream(20);
        System.out.println(ic.price());
        print();
    }
}

class IceCreamPlusJam extends IceCream {
    private static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    @Override
    public int price() {
        return JAM_PRICE + super.price();
    }

    public static void print() {
        System.out.println("naslednik");
    }


        public static void main(String[] args) {
        IceCreamPlusJam jam = new IceCreamPlusJam(40);
       // System.out.println(jam.price());*/
        IceCream ic = new IceCream(20);
        ic.print();
        jam.print();
    }
}



