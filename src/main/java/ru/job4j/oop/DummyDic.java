package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
            return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic petya = new DummyDic();
        String song = "I believe, I can fly";
        String song1 = "Who let";
        String num = petya.engToRus(song);
        System.out.println(num);
        String num1 = petya.engToRus(song1);
        System.out.println(num1);
    }
}
