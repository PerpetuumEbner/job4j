package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        int size = products.length;
        for (int i = index; i < size; i++) {
            if (i == size - 1) {
                break;
            }
            products[i] = products[i + 1];
        }
        products[size - 1] = null;
        return products;
    }
}