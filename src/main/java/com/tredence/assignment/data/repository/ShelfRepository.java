package com.tredence.assignment.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tredence.assignment.data.model.Shelf;

public interface ShelfRepository extends JpaRepository<Shelf, Long> {

}
