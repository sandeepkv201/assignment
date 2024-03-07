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
import jakarta.persistence.criteria.Subquery;

@Repository
public class ShelfDao {

    private static final String CATEGORY = "category";
    private static final String RELEVANCY_SCORE = "relevancyScore";
    private static final String PRODUCT = "product";
    private static final String SHOPPER_ID = "shopperId";
    private static final String SHOPPER = "shopper";

    private EntityManager entityManager;

    public ShelfDao(@Autowired EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Query to get max score category per shopper
     * 
     * @return
     */
    public TypedQuery<Tuple> categoryWithMaxScorePerShopperQuery() {
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

        return entityManager.createQuery(criteriaQuery);
    }
}
