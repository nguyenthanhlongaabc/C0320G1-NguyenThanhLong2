package com.codegym.casestudymodule2javaweb.service;

import com.codegym.casestudymodule2javaweb.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer getCustomerById(Long id);

    Page<Customer> getAllCustomer(Pageable pageable);

    Page<Customer> getAllCustomerByNameAndAddress(String searchName,String searchAddress, Pageable pageable);

    Iterable<Customer> getAllCustomer();
}
