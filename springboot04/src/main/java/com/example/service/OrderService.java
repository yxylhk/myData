package com.example.service;

import com.example.order.Order;

public interface OrderService {
    Boolean add(Order order);

    Boolean del(Integer oid);

    Boolean update(Order order);

    Order findById(Integer oid);
}
