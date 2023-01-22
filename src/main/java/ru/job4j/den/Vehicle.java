package ru.job4j.den;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String type;
    private int passengers;
    private int maxSpeed;

    public abstract void accelerate();

    public abstract void steer();

    public void brake() {
        System.out.println("Стандартная тормозная система");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Truck extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.accelerate();
        truck.steer();
        truck.brake();
    }

}
