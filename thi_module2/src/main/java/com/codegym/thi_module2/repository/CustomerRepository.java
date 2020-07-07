package com.codegym.thi_module2.repository;

import com.codegym.thi_module2.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Page<Customer> findAllByCustomerCodeContainingAndNameContaining(String customerCode, String name, Pageable pageable);
}
