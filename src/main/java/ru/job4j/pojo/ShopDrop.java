package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                for (int g = i; g < (products.length - 1); g++) {
                    products[g] = products[g + 1];
                }
                products[(products.length - 1)] = null;
                break;
            }
        }
        return products;
    }
}
