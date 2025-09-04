package com.github.ajg_iz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        for (int i=0; i<10; i++) {
            productRepo.addProduct(new Product(i, "Product"+i, Double.valueOf(i)+0.99d));
        }

        ShopService shopService = new ShopService(new OrderListRepo(),  productRepo);

    }
}