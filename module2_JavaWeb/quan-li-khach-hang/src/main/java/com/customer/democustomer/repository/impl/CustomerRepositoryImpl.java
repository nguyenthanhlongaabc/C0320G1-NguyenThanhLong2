package com.customer.democustomer.repository.impl;

import com.customer.democustomer.models.Customer;
import com.customer.democustomer.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private static Map<Integer,Customer> listCustomer;
    static {
        listCustomer = new HashMap<>();
        listCustomer.put(1,new Customer(1,"Long","long@gmail.com","Quảng Trị"));
        listCustomer.put(2,new Customer(2,"Bách","bach@gmail.com","Đà Nẵng"));
        listCustomer.put(3,new Customer(3,"An","an@gmail.com","Quảng Ngãi"));
        listCustomer.put(4,new Customer(4,"Toàn","toan@gmail.com","Huế"));
    }

    @Override
    public List<Customer> getAll() {
        return new ArrayList<>(listCustomer.values());
    }

    @Override
    public Customer getById(int id) {
        return listCustomer.get(id);
    }

    @Override
    public void deleteById(int id) {
        listCustomer.remove(id);
    }

    @Override
    public void save(Customer customer) {
        listCustomer.put(customer.getId(),customer);
    }

    @Override
    public void update(int id, Customer customer) {
        listCustomer.put(id,customer);
    }
}
