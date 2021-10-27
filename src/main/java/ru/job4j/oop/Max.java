package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third, int fourth) {
        int result = max(left, right);
        int result1 = max(result, third);
        return max(result1, fourth);
    }
}
