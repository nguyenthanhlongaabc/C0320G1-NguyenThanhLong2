package com.customer.democustomer.services;

import com.customer.democustomer.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    Customer getCustomerById(int id);
    void deleteCustomerById(int id);
    void saveCustomer(Customer customer);
    void updateCustomer(int id, Customer customer);
}
