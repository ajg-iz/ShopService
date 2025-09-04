package com.github.ajg_iz;

public class ShopService {
    OrderRepo orderRepo;
    ProductRepo productRepo;

    public ShopService() {
        this.orderRepo = new OrderMapRepo();
        this.productRepo = new ProductRepo();
    }
    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public boolean newOrder(Order order) {
        for (Product each : order.products()) {
            if (productRepo.getProductByID(each.ID()) == null) {
                System.out.println("Can't take Order, out of "+each.name());
                return false;
            }
        }
        return orderRepo.addOrder(order);
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orderRepo=" + orderRepo +
                ", productRepo=" + productRepo +
                '}';
    }
}
