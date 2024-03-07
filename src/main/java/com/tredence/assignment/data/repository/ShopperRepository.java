package com.tredence.assignment.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tredence.assignment.data.model.Shopper;

public interface ShopperRepository extends JpaRepository<Shopper, String> {

}
