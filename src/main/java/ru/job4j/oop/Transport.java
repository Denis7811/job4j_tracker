package ru.job4j.oop;

public interface Transport {

    void go();

    void passengers(int numberOfPassengers);

    int refuel(int fuelQuantity);
}
