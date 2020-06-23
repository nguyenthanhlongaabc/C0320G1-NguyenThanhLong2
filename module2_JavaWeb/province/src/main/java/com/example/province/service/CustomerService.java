package com.example.province.service;

import com.example.province.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    void createCustomer( Customer customer);
    void deleteCustomerById(Long id);

    Customer getCustomerById(Long id);

    Page<Customer> getAllCustomer(Pageable pageable);
}
