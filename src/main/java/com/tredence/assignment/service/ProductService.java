package com.tredence.assignment.service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tredence.assignment.dto.outbound.ShopperCategoryWithMaxScoreDTO;
import com.tredence.assignment.repository.model.Product;
import com.tredence.assignment.repository.model.Shelf;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;

@Service
public class ProductService {

    private static final String CATEGORY = "category";

    private static final String BRAND = "brand";

    private static final String SHELFS = "shelfs";

    private static final String RELEVANCY_SCORE = "relevancyScore";

    private static final String PRODUCT = "product";

    private static final String SHOPPER_ID = "shopperId";

    private static final String SHOPPER = "shopper";

    private static final String PRODUCT_ID = "productId";

    private EntityManager entityManager;

    public ProductService(@Autowired EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Query to fetch Brands with no Shoppers
     * 
     * @return
     */
    @Transactional(readOnly = true)
    public List<String> getBrandsWithoutShoppers() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<String> criteriaQuery = criteriaBuilder.createQuery(String.class);
        Root<Product> productRoot = criteriaQuery.from(Product.class);
        Join<Product, Shelf> shelfJoin = productRoot.join(SHELFS, JoinType.LEFT);

        criteriaQuery.select(productRoot.get(BRAND))
                .distinct(true).orderBy(criteriaBuilder.asc(productRoot.get(BRAND)))
                .where(criteriaBuilder.isNull(shelfJoin.get(SHOPPER)));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Transactional(readOnly = true)
    public List<ShopperCategoryWithMaxScoreDTO> getCategoryWithMaxScorePerShopper() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createTupleQuery();
        Root<Shelf> shelfRoot = criteriaQuery.from(Shelf.class);
        Join<Shelf, Product> productJoin = shelfRoot.join(PRODUCT, JoinType.INNER);

        // Get Max Score Per Shopper in Sub Query
        Subquery<Double> subQuery = criteriaQuery.subquery(Double.class);
        Root<Shelf> subShelfRoot = subQuery.from(Shelf.class);
        subQuery.select(criteriaBuilder.max(subShelfRoot.get(RELEVANCY_SCORE)))
                .where(criteriaBuilder.equal(subShelfRoot.get(SHOPPER), shelfRoot.get(SHOPPER)));

        criteriaQuery.multiselect(shelfRoot.get(SHOPPER).get(SHOPPER_ID), productJoin.get(CATEGORY),
                shelfRoot.get(RELEVANCY_SCORE)).orderBy(criteriaBuilder.desc(shelfRoot.get(RELEVANCY_SCORE)))
                .where(criteriaBuilder.equal(shelfRoot.get(RELEVANCY_SCORE), subQuery.getSelection()));

        return entityManager.createQuery(criteriaQuery).getResultStream().map(tuple -> {
            return new ShopperCategoryWithMaxScoreDTO(tuple.get(0).toString(),
                    tuple.get(1).toString(),
                    Double.valueOf(tuple.get(2).toString()));
        }).collect(Collectors.toList());
    }

    /**
     * Query to fetch Products by Shopper
     * 
     * @return Map with Shopper ID as key and Product ID's list as values
     */
    @Transactional(readOnly = true)
    public Map<String, Set<String>> getProductsByShopper() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createTupleQuery();
        Root<Shelf> selfRoot = criteriaQuery.from(Shelf.class);

        criteriaQuery.multiselect(selfRoot.get(SHOPPER).get(SHOPPER_ID), selfRoot.get(PRODUCT).get(PRODUCT_ID))
                .distinct(true);

        return entityManager.createQuery(criteriaQuery).getResultStream()
                .collect(Collectors.groupingBy(
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
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createTupleQuery();
        Root<Shelf> shelfRoot = criteriaQuery.from(Shelf.class);

        criteriaQuery.multiselect(shelfRoot.get(PRODUCT).get(PRODUCT_ID), shelfRoot.get(SHOPPER).get(SHOPPER_ID))
                .distinct(true);

        return entityManager.createQuery(criteriaQuery).getResultStream()
                .collect(Collectors.groupingBy(
                        tuple -> tuple.get(0).toString(),
                        Collectors.mapping(tuple -> tuple.get(1).toString(), Collectors.toSet())));
    }
}
