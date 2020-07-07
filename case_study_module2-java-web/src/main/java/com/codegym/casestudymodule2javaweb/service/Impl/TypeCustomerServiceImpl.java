package com.codegym.casestudymodule2javaweb.service.Impl;

import com.codegym.casestudymodule2javaweb.entity.TypeCustomer;
import com.codegym.casestudymodule2javaweb.repository.TypeCustomerRepository;
import com.codegym.casestudymodule2javaweb.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    @Autowired
    private TypeCustomerRepository typeCustomerRepository;

    @Override
    public TypeCustomer getTypeCustomerById(Long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<TypeCustomer> getAllTypeCustomer() {
        return typeCustomerRepository.findAll();
    }
}
