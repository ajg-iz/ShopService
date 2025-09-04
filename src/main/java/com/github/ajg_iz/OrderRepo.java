package com.github.ajg_iz;

import java.util.List;

public interface OrderRepo {
    List<Order> getOrders();
    void setOrders(List<Order> orders);
    boolean addOrder(Order order);
    boolean removeOrder(Order order);
    Order getOrderByID(int ID);
    String toString();
}
