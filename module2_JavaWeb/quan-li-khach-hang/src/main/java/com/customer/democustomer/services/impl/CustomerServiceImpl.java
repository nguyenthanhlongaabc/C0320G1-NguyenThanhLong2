package com.customer.democustomer.services.impl;

import com.customer.democustomer.models.Customer;
import com.customer.democustomer.repository.CustomerRepository;
import com.customer.democustomer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAll();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        customerRepository.update(id,customer);
    }
}
