package com.tredence.assignment.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tredence.assignment.data.model.Product;
import com.tredence.assignment.data.model.Shelf;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

@Repository
public class ProductDao {
    private static final String BRAND = "brand";
    private static final String SHELFS = "shelfs";
    private static final String PRODUCT = "product";
    private static final String SHOPPER_ID = "shopperId";
    private static final String SHOPPER = "shopper";
    private static final String PRODUCT_ID = "productId";

    private EntityManager entityManager;

    public ProductDao(@Autowired EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public TypedQuery<Tuple> productsAndShoppersQuery() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createTupleQuery();
        Root<Shelf> selfRoot = criteriaQuery.from(Shelf.class);

        criteriaQuery.multiselect(selfRoot.get(SHOPPER).get(SHOPPER_ID), selfRoot.get(PRODUCT).get(PRODUCT_ID))
                .distinct(true);

        return entityManager.createQuery(criteriaQuery);
    }

    public TypedQuery<String> brandsWithoutShoppersQuery() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<String> criteriaQuery = criteriaBuilder.createQuery(String.class);
        Root<Product> productRoot = criteriaQuery.from(Product.class);
        Join<Product, Shelf> shelfJoin = productRoot.join(SHELFS, JoinType.LEFT);

        criteriaQuery.select(productRoot.get(BRAND))
                .distinct(true).orderBy(criteriaBuilder.asc(productRoot.get(BRAND)))
                .where(criteriaBuilder.isNull(shelfJoin.get(SHOPPER)));

        return entityManager.createQuery(criteriaQuery);
    }
}
