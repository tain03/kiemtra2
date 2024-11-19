package com.ecommerce.orderprocessing.service;

import com.ecommerce.orderprocessing.entity.Order;
import com.ecommerce.orderprocessing.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Get all orders
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Save or update an order
    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get order by ID
    @Override
    public Order getOrderById(Long orderId) { // Change to Long
        return orderRepository.findById(orderId).orElse(null);
    }

    // Delete an order
    @Override
    public void deleteOrder(Long orderId) { // Change to Long
        orderRepository.deleteById(orderId);
    }
}
