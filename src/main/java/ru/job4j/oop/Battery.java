package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batDur = new Battery(71);
        Battery batEner = new Battery(33);
        System.out.println("Duracell : " + batDur.load + ". Energaizer : " + batEner.load);
        batDur.exchange(batEner);
        System.out.println("Duracell : " + batDur.load + ". Energaizer : " + batEner.load);
        }
}
