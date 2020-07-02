package com.codegym.casestudymodule2javaweb.repository;

import com.codegym.casestudymodule2javaweb.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Page<Customer> findAllByNameContainingAndAddressContaining(String name,String address, Pageable pageable);
}
