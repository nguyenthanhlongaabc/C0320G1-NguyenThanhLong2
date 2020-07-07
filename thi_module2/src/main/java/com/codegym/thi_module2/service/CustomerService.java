package com.codegym.thi_module2.service;

import com.codegym.thi_module2.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer getCustomerById(Long id);

    Page<Customer> getAllCustomer(Pageable pageable);

    Page<Customer> getAllCustomerByCustomerCodeAndName(String searchCustomerCode,String searchName, Pageable pageable);
}
