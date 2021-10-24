package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        System.out.println("Неизвестное слово. " + eng);
    return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic petya = new DummyDic();
        String song = "I believe, I can fly";
        String song1 = "Who let";
        petya.engToRus(song);
        petya.engToRus(song1);
           }
}
