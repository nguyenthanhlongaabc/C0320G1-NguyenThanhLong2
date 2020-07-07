package com.codegym.thi_module2.service.Impl;

import com.codegym.thi_module2.entity.Customer;
import com.codegym.thi_module2.repository.CustomerRepository;
import com.codegym.thi_module2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> getAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> getAllCustomerByCustomerCodeAndName(String searchCustomerCode, String searchName, Pageable pageable) {
        return customerRepository.findAllByCustomerCodeContainingAndNameContaining(searchCustomerCode, searchName, pageable);
    }
}
