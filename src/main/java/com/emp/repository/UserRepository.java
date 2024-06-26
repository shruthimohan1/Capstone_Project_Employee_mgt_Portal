package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}