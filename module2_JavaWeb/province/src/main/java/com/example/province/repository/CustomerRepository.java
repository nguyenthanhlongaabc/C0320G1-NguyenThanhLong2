package com.example.province.repository;

import com.example.province.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long>{
    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
