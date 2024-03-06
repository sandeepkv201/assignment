package com.tredence.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tredence.assignment.repository.model.Shopper;

public interface ShopperRepository extends JpaRepository<Shopper, String> {

}
