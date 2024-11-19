package com.ecommerce.orderprocessing.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;
    private String email;
    private String phone;

    @Enumerated(EnumType.STRING)
    private CustomerPaymentMethod paymentMethod; // Assuming you have CustomerPaymentMethod defined

    @Embedded
    private Address defaultAddress;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders; // Correct the mappedBy attribute
}
