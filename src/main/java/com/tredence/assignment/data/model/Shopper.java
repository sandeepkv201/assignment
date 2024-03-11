package com.tredence.assignment.data.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Shopper implements Serializable {

    private static final long serialVersionUID = 2L;

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

    @Override
    public int hashCode() {
        return Objects.hash(shopperId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Shopper))
            return false;
        Shopper other = (Shopper) obj;
        return Objects.equals(shopperId, other.shopperId);
    }
}
