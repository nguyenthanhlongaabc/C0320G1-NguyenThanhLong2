package com.example.demoproduct.repository.impl;

import com.example.demoproduct.models.Product;
import com.example.demoproduct.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer,Product> listProduct;

    static {
        listProduct = new HashMap<>();
        listProduct.put(1,new Product(1,"IphoneX",20000000,"New","Apple"));
        listProduct.put(2,new Product(2,"SamSungS9",19000000,"New","SamSung"));
        listProduct.put(3,new Product(3,"Iphone7",12000000,"New","Apple"));
        listProduct.put(4,new Product(4,"Iphone8",15000000,"New","Apple"));
    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public Product getById(int id) {
        return listProduct.get(id);
    }

    @Override
    public void deleteById(int id) {
        listProduct.remove(id);
    }

    @Override
    public void save(Product product) {
        listProduct.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id,product);
    }
}
