package com.tredence.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tredence.assignment.repository.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
