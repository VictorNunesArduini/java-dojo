package com.dtidigital.java.introduction.service.impl;

import com.dtidigital.java.introduction.entities.Product;
import com.dtidigital.java.introduction.repositories.ProductRepository;
import com.dtidigital.java.introduction.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public Product findProduct(UUID identifier) {
        final Optional<Product> optionalProduct = productRepository.findById(identifier);
        return optionalProduct.orElse(null);
    }

    public List<Product> listProducts() {
        return productRepository.findAll();
    }

}
