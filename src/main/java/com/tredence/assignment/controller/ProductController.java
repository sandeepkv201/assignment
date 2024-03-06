package com.tredence.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tredence.assignment.repository.ProductRepository;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
