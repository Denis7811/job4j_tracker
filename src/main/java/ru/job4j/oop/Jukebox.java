package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
            } else if (position == 2) {
                 System.out.println("Спокойной ночи");
                 } else {
                     System.out.println("Песня не найдена");
                    }
        }

    public void book(int page, String author) {
        System.out.println(page + author);
    }

    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        int number1 = 1;
        int number2 = 2;
        int number3 = 320;
        petya.music(number1);
        petya.music(number2);
        petya.music(number3);
        Jukebox denis = new Jukebox();
        int page1 = 10000;
        String author1 = "Чехов";
        denis.book(page1, author1);
    }
}
