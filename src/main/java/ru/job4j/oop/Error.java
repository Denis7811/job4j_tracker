package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorNum1 = new Error(false, 1000, "Hello My construktor!");
        Error errorNum2 = new Error(true, -2000, "Number 2 construktor!");
        errorNum1.printInfo();
        errorNum2.printInfo();
    }
}
