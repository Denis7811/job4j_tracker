package ru.job4j.oop;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Passenger = " + numberOfPassengers);
    }

    @Override
    public int refuel(int fuelQuantity) {
        fuelQuantity = fuelQuantity * 2;
        System.out.println(fuelQuantity);
        return fuelQuantity;
    }
}
