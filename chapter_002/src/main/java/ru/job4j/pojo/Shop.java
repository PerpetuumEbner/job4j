package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        print(products);
        System.out.println();

        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;
        print(products);
        System.out.println();

        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        print(products);
        System.out.println();

        Shop shop = new Shop();
        shop.delete(products, 0);
        print(products);
    }

    private static void print(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public Product[] delete(Product[] products, int index) {
        for (int count = index; count < products.length - 1; count++) {
            products[count] = products[count + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}