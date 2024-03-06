package com.tredence.assignment.repository.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Shopper {

    @Id
    private String shopperId;

    @Column(nullable = false)
    private String shopperName;

    @OneToMany(mappedBy = "shopper", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Shelf> shelfs;

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getShopperName() {
        return shopperName;
    }

    public void setShopperName(String shopperName) {
        this.shopperName = shopperName;
    }

    public Set<Shelf> getShelfs() {
        return shelfs;
    }

    public void setShelfs(Set<Shelf> shelfs) {
        this.shelfs = shelfs;
    }
}
