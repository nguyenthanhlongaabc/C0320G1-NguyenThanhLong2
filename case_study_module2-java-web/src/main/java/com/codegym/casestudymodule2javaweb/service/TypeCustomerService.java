package com.codegym.casestudymodule2javaweb.service;

import com.codegym.casestudymodule2javaweb.entity.TypeCustomer;

import java.util.List;

public interface TypeCustomerService {
    TypeCustomer getTypeCustomerById(Long id);
    Iterable<TypeCustomer> getAllTypeCustomer();
}
