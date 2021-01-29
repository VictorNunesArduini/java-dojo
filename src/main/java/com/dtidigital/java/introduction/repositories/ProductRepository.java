package com.dtidigital.java.introduction.repositories;

import com.dtidigital.java.introduction.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
