package com.github.ajg_iz;

import java.util.List;

public interface OrderRepo {
    public List<Order> getOrders();
    public void setOrders(List<Order> orders);
    public boolean addOrder(Order order);
    public boolean removeOrder(Order order);
    public Order getOrderByID(int ID);
}
