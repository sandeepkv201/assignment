package com.tredence.assignment.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tredence.assignment.data.dto.outbound.ShopperCategoryWithMaxScoreDTO;
import com.tredence.assignment.service.ProductService;

@RestController
public class WelcomeController {

    private ProductService productService;

    public WelcomeController(@Autowired ProductService productService) {
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

    /**
     * Private api which can be accessed only from same domain.
     * 
     * @return
     */
    @GetMapping("max-score-category-shopper")
    public List<ShopperCategoryWithMaxScoreDTO> getCategoryWithMaxScorePerShopper() {
        return productService.getCategoryWithMaxScorePerShopper();
    }

    /**
     * Private api which can be accessed only from same domain.
     * 
     * @return
     */
    @GetMapping("products-by-shopper")
    public Map<String, Set<String>> getProductsByShopper() {
        return productService.getProductsByShopper();
    }

    /**
     * Private api which can be accessed only from same domain.
     * 
     * @return
     */
    @GetMapping("shoppers-by-product")
    public Map<String, Set<String>> getShoppersByProduct() {
        return productService.getShoppersByProduct();
    }
}
