package com.github.ajg_iz;

public class ShopService {
    OrderListRepo orderListRepo;
    ProductRepo productRepo;

    public ShopService() {
        this.orderListRepo = new OrderListRepo();
        this.productRepo = new ProductRepo();
    }
    public ShopService(OrderListRepo orderListRepo, ProductRepo productRepo) {
        this.orderListRepo = orderListRepo;
        this.productRepo = productRepo;
    }

    public boolean newOrder(Order order) {
        for (Product each : order.products()) {
            if (each == null) {
                System.out.println("Can't take Order, out of "+each.name());
                return false;
            }
            if (productRepo.getProductByID(each.ID()) == null) {
                System.out.println("Can't take Order, out of "+each.name());
                return false;
            }
        }
        return orderListRepo.addOrder(order);
    }

    public OrderListRepo getOrderListRepo() {
        return orderListRepo;
    }

    public void setOrderListRepo(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
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
                "orderListRepo=" + orderListRepo +
                ", productRepo=" + productRepo +
                '}';
    }
}
