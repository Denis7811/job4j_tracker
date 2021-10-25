package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another, Battery another1) {
        this.load = this.load + another.load + another1.load;
        another.load = 0;
        another1.load = 0;
    }

    public static void main(String[] args) {
        Battery batDur = new Battery(71);
        Battery batEner = new Battery(33);
        Battery batVolna = new Battery(57);
        System.out.println("Durac : " + batDur.load + ". Energaiz : " + batEner.load + ". Volna : "
                + batVolna.load);
        batVolna.exchange(batDur, batEner);
        System.out.println("Durac : " + batDur.load + ". Energaiz : " + batEner.load + ". Volna : "
                + batVolna.load);
        }
}
