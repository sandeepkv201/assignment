package com.tredence.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tredence.assignment.service.ProductService;

/**
 * Define API's which are external and can be used by any client in public.
 * Add CrossOrigin configuration so it can be accessd by any domain.
 */
@RestController
@RequestMapping("/external")
@CrossOrigin(origins = "*")
public class ExternalController {

    private ProductService productService;

    public ExternalController(@Autowired ProductService productService) {
        this.productService = productService;
    }

    /**
     * Public api which can be called from any domain
     * 
     * @return
     */
    @CrossOrigin(origins = "*")
    @GetMapping("brands-without-shopper")
    public List<String> getMethodName() {
        return productService.getBrandsWithoutShoppers();
    }
}
