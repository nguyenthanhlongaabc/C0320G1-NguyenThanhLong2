package com.example.demoproduct.services;

import com.example.demoproduct.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(int id);
    void deleteProductById(int id);
    void saveProduct(Product product);
    void updateProduct(int id, Product product);

}
