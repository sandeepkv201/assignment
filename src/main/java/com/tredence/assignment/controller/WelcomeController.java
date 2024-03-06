package com.tredence.assignment.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tredence.assignment.dto.outbound.ShopperCategoryWithMaxScoreDTO;
import com.tredence.assignment.service.ProductService;

@RestController
public class WelcomeController {

    private ProductService productService;

    public WelcomeController(@Autowired ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("brands-without-shopper")
    public List<String> getMethodName() {
        return productService.getBrandsWithoutShoppers();
    }

    @GetMapping("max-score-category-shopper")
    public List<ShopperCategoryWithMaxScoreDTO> getCategoryWithMaxScorePerShopper() {
        return productService.getCategoryWithMaxScorePerShopper();
    }

    @GetMapping("products-by-shopper")
    @Transactional(readOnly = true)
    public Map<String, Set<String>> getProductsByShopper() {
        return productService.getProductsByShopper();
    }

    @GetMapping("shoppers-by-product")
    @Transactional(readOnly = true)
    public Map<String, Set<String>> getShoppersByProduct() {
        return productService.getShoppersByProduct();
    }
}
