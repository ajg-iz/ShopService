package com.github.ajg_iz;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products;
    public ProductRepo() {
        this.products = new ArrayList<>();
    }
    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product product) {
        return this.products.add(product);
    }

    public boolean removeProduct(Product product) {
        return this.products.remove(product);
    }

    public Product getProductByName(String  name) {
        for (Product product : products) {
            if (product.name().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByID(int ID) {
        for (Product product : products) {
            if (product.ID() == ID) {
                return product;
            }
        }
        throw new IllegalArgumentException("No Product with ID " + ID + " exists.");
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
