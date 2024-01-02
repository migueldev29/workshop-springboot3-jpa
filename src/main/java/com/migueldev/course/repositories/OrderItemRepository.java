package com.migueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
