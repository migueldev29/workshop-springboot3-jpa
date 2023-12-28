package com.migueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
