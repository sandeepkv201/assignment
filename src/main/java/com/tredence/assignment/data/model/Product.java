package com.tredence.assignment.data.model;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    private String productId;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String brand;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Shelf> shelfs;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Set<Shelf> getShelfs() {
        return shelfs;
    }

    public void setShelfs(Set<Shelf> shelfs) {
        this.shelfs = shelfs;
    }
}
