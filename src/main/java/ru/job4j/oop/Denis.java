package ru.job4j.oop;

public class Denis {

    public void ucheba(String domashka) {
        System.out.println(domashka);
    }

    public int sport(int vozrast) {
        int klass = vozrast - 6;
        return klass;
        }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Denis papa = new Denis();
        String russkii = "Uchim pravila";
        String matem = "Reshaem uravneniy";
        papa.ucheba(russkii);
        papa.ucheba(matem);
        int sasha = papa.sport(10);
        int tany = papa.sport(8);
        System.out.println(sasha);
        System.out.println(tany);
    }
}
