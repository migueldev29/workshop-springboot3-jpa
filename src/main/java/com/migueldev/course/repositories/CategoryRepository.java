package com.migueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
