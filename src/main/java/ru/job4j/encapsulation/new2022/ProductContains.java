package ru.job4j.encapsulation.new2022;
import java.util.Objects;

public class ProductContains {
    private String name;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductContains that = (ProductContains) o;
        return count == that.count && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        /*Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean eq = first == second;
        System.out.println(eq);
        System.out.println(first.equals(second));*/
        ProductContains p1 = new ProductContains();
        ProductContains p2 = new ProductContains();
        p1.setCount(1);
        p2.setCount(1);
        System.out.println(p1.equals(p2));
    }
}
