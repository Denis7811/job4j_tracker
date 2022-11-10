package ru.job4j.encapsulation.new2022;

public class Shop {
    public static int indexOfNull(Product[] prod) {
        int a = -1;
        for (int i = 0; i < prod.length; i++) {
            Product prod1 = prod[i];
            if (prod1 == null) {
                a = i;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            }
        }
        int num = indexOfNull(products);
        System.out.println(num);
    }
}
