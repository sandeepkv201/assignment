package com.tredence.assignment.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tredence.assignment.data.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
