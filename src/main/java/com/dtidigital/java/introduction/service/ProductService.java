package com.dtidigital.java.introduction.service;

import com.dtidigital.java.introduction.entities.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    void saveProduct(Product product);

    List<Product> listProducts();

    Product findProduct(UUID identifier);

}
