package com.github.ajg_iz;

import java.util.Collection;
import java.util.List;

public interface OrderRepo {
    Collection<Order> getOrders();
    void setOrders(List<Order> orders);
    boolean addOrder(Order order);
    boolean removeOrder(Order order);
    Order getOrderByID(int ID);
    String toString();
}
