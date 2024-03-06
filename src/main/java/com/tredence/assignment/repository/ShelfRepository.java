package com.tredence.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tredence.assignment.repository.model.Shelf;

public interface ShelfRepository extends JpaRepository<Shelf, Long> {

}
