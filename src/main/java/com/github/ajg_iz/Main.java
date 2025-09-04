package com.github.ajg_iz;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        //add ten dummy products
        for (int i=0; i<10; i++) {
            productRepo.addProduct(new Product(i, "Product"+i, i+0.99d));
        }

        //construct the ShopService
        ShopService shopService = new ShopService(new OrderListRepo(),  productRepo);
        shopService.newOrder(new Order(1, Arrays.asList(productRepo.getProductByID(1),  productRepo.getProductByID(2), productRepo.getProductByID(3))));
        shopService.newOrder(new Order(2, Arrays.asList(productRepo.getProductByID(4),  productRepo.getProductByID(5), productRepo.getProductByID(6))));


        //print out the ShopService
        System.out.println(shopService);
    }
}