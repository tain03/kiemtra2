package com.ecommerce.orderprocessing.service;

import com.ecommerce.orderprocessing.entity.Customer;
import com.ecommerce.orderprocessing.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Save or update a customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get customer by ID
    public Customer getCustomerById(String customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    // Delete a customer
    public void deleteCustomer(String customerId) {
        customerRepository.deleteById(customerId);
    }
}
