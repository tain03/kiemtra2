package com.ecommerce.orderprocessing.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long orderId;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;
    private String status;
    private String paymentStatus;
    private AddressDTO shippingAddress;
    private List<OrderItemDTO> orderItems;
}
