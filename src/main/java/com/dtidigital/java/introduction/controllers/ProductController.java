package com.dtidigital.java.introduction.controllers;

import com.dtidigital.java.introduction.entities.Product;
import com.dtidigital.java.introduction.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@AllArgsConstructor
public class ProductController {

    final ProductService productService;

    @GetMapping(value = "/products")
    public ResponseEntity<List<Product>> getProducts() {

        List<Product> productList = productService.listProducts();
        if (!productList.isEmpty())
            return ResponseEntity.ok(productList);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/product")
    public ResponseEntity<Product> saveProducts(@RequestBody Product product) {

        productService.saveProduct(product);

        return ResponseEntity.ok(product);
    }

}
