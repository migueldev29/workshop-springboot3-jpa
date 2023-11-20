package com.migueldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
