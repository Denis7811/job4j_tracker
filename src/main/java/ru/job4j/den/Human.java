package ru.job4j.den;

interface Swim {
    void swim();
}
    public class Human implements Swim {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void swim() {
            System.out.println(toString()+" Я плаваю с помощью надувного круга.");
        }

        @Override
        public String toString() {
            return "Я " + name + ", мне " + age + " лет. ";
        }

    }

    class Fish implements Swim {
        private String name;

        public Fish(String name) {
            this.name = name;
        }

        @Override
        public void swim() {
            System.out.println("Я рыба " + name + ". Я плыву, двигая плавниками.");

        }
    }

        class UBoat implements Swim {

            private int speed;

            public UBoat(int speed) {
                this.speed = speed;
            }

            @Override
            public void swim() {
                System.out.println("Подводная лодка плывет, вращая винты, со скоростью " + speed + " узлов.");
            }
        }

class Main {

    public static void main(String[] args) {
        Swim human = new Human("Антон", 6);
        Swim fish = new Fish("кит");
        Swim boat = new UBoat(25);

        Swim [] swimmers = {human, fish, boat};
        for (Swim s : swimmers) {
            s.swim();
        }
    }
}
