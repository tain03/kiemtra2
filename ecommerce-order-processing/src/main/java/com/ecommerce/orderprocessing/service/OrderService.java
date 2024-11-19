package com.ecommerce.orderprocessing.service;

import com.ecommerce.orderprocessing.entity.Order;
import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order saveOrder(Order order);

    Order getOrderById(Long orderId);  // Ensure orderId is Long

    void deleteOrder(Long orderId);  // Ensure orderId is Long
}
