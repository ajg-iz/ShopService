package com.github.ajg_iz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    List<Order> orders;

    OrderListRepo() {
        this.orders = new ArrayList<>();
    }
    OrderListRepo(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public Collection<Order> getOrders() {
        return orders;
    }

    @Override
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean addOrder(Order order) {
        return orders.add(order);
    }

    public boolean removeOrder(Order order) {
        return orders.remove(order);
    }

    @Override
    public Order getOrderByID(int ID) {
        for (Order order : orders) {
            if (order.ID() == ID) {
                return order;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
