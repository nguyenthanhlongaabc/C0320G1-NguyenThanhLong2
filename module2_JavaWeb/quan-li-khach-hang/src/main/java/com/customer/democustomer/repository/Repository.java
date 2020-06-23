package com.customer.democustomer.repository;

import java.util.List;

public interface Repository<C> {
    List<C> getAll();
    C getById(int id);
    void deleteById(int id);
    void save(C c);
    void update(int id, C c);
}
