package com.migueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
