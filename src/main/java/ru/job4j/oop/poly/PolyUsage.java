package ru.job4j.oop.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Train train = new Train();
        Bus bus = new Bus();
        Vechicle vehicle1 = airplane;
        Vechicle vehicle2 = train;
        Vechicle vehicle3 = bus;
        Vechicle[] vehicles = new Vechicle[]{vehicle1, vehicle2, vehicle3};
        for (Vechicle v : vehicles) {
            v.move();
        }
    }
}
