package com.tredence.assignment.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Shelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double relevancyScore;

    @ManyToOne()
    @JoinColumn(name = "shopper_id")
    private Shopper shopper;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRelevancyScore() {
        return relevancyScore;
    }

    public void setRelevancyScore(Double relevancyScore) {
        this.relevancyScore = relevancyScore;
    }

    public Shopper getShopper() {
        return shopper;
    }

    public void setShopper(Shopper shopper) {
        this.shopper = shopper;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
