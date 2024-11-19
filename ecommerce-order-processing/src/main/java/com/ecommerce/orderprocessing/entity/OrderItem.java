package com.ecommerce.orderprocessing.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String productId;

    private Integer quantity;

    private BigDecimal unitPrice;

    private BigDecimal subTotal;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    // Add constructors, getters, setters, and methods (e.g., calculateSubTotal)
}
