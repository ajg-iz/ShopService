package com.github.ajg_iz;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> orders;

    OrderListRepo() {
        this.orders = new ArrayList<>();
    }
    OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public boolean removeOrder(Order order) {
        return orders.remove(order);
    }

    public Order getOrderByID(int ID) {
        for (Order order : orders) {
            if (order.ID() == ID) {
                return order;
            }
        }
        return null;
    }

}
