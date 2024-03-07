package com.tredence.assignment.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tredence.assignment.data.dao.ProductDao;
import com.tredence.assignment.data.dao.ShelfDao;
import com.tredence.assignment.data.dto.outbound.ShopperCategoryWithMaxScoreDTO;

@Service
public class ProductService {

    private ShelfDao shelfDao;
    private ProductDao productDao;

    public ProductService(@Autowired ShelfDao shelfDao,
            @Autowired ProductDao productDao) {
        this.shelfDao = shelfDao;
        this.productDao = productDao;
    }

    /**
     * Query to fetch Brands with no Shoppers
     * 
     * @return
     */
    @Transactional(readOnly = true)
    public List<String> getBrandsWithoutShoppers() {
        return productDao.brandsWithoutShoppersQuery().getResultList();
    }

    /**
     * Query
     * 
     * @return
     */
    @Transactional(readOnly = true)
    public List<ShopperCategoryWithMaxScoreDTO> getCategoryWithMaxScorePerShopper() {
        return shelfDao.categoryWithMaxScorePerShopperQuery().getResultStream().map(tuple -> {
            return new ShopperCategoryWithMaxScoreDTO(tuple.get(0).toString(),
                    tuple.get(1).toString(), Double.valueOf(tuple.get(2).toString()));
        }).collect(Collectors.toList());
    }

    /**
     * Query to fetch Products by Shopper
     * 
     * @return Map with Shopper ID as key and Product ID's list as values
     */
    @Transactional(readOnly = true)
    public Map<String, Set<String>> getProductsByShopper() {
        return productDao.productsAndShoppersQuery().getResultStream().collect(Collectors.groupingBy(
                tuple -> tuple.get(0).toString(),
                Collectors.mapping(tuple -> tuple.get(1).toString(), Collectors.toSet())));
    }

    /**
     * Query to fetch Shoppers by Product
     * 
     * @return Map with Product ID as key and Shopper ID's list as values
     */
    @Transactional(readOnly = true)
    public Map<String, Set<String>> getShoppersByProduct() {
        return productDao.productsAndShoppersQuery().getResultStream()
                .collect(Collectors.groupingBy(
                        tuple -> tuple.get(1).toString(),
                        Collectors.mapping(tuple -> tuple.get(0).toString(), Collectors.toSet())));
    }
}
