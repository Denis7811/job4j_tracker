package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        return max(max(left, right), third);
    }

    public static int max(int left, int right, int third, int fourth) {
       return max(max(left, right), max(third, fourth));
    }
}
