package com.github.ajg_iz;

import java.util.*;

public class OrderMapRepo implements OrderRepo{
    Map<Integer, Order> orders;

    OrderMapRepo() {
        this.orders = new HashMap<Integer, Order>();
    }
    OrderMapRepo(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    @Override
    public Collection<Order> getOrders() {
        return orders.values();
    }

    @Override
    public void setOrders(List<Order> orders) {
        this.orders.clear();
        for (Order each : orders) {
            this.orders.put(each.ID(), each);
        }
    }

    @Override
    public boolean addOrder(Order order) {
        return orders.put(order.ID(), order) != null;
    }

    public boolean removeOrder(Order order) {
        return orders.remove(order.ID()) != null;
    }

    @Override
    public Order getOrderByID(int ID) {
        if (!orders.containsKey(ID)) {
            return null;
        }
        return orders.get(ID);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
